package seg_info_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import JavaDB.ConnectionFactory;
import dto.AlbuminaDto;
import modelo.Paciente;
import modelo.Albumina;

public class ExameDao {
    private Decriptografa deCrypt;
    private Connection connection;

    public ExameDao(Decriptografa deCrypt) throws Exception {
        this.deCrypt = deCrypt;
        this.connection = ConnectionFactory.getConnection();
    }
    
    

    public void insereAlbumina(AlbuminaDto albuminaDto, Paciente p) throws Exception {
        try {
            String query = "INSERT INTO albumina (tipo_metrica, resultado, paciente_id) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = this.connection.prepareStatement(query);
            preparedStatement.setBytes(1, deCrypt.encrypt(albuminaDto.getTipoMetrica()));
            preparedStatement.setBytes(2, deCrypt.encrypt(albuminaDto.getResultado()));
            preparedStatement.setInt(3, p.getId());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public AlbuminaDto recuperaExame(int exameId) throws Exception {
        try {
            String query = "SELECT * FROM albumina WHERE id = ?";
            PreparedStatement preparedStatement = this.connection.prepareStatement(query);
            preparedStatement.setInt(1, exameId);
            ResultSet resultSet = preparedStatement.executeQuery();

            
            
            if (resultSet.next()) {
                String tipoMetrica = deCrypt.decrypt(resultSet.getBytes("tipo_metrica"));
                String resultado = deCrypt.decrypt(resultSet.getBytes("resultado"));
                
                AlbuminaDto albuminaDto = new AlbuminaDto(tipoMetrica, resultado);
                return albuminaDto;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
