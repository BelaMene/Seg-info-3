package teste;

import dto.AlbuminaDto;
import modelo.Paciente;
import seg_info_3.ChaveSecretaDao;
import seg_info_3.Decriptografa;
import seg_info_3.ExameDao;

public class TestaDecriptografa {

	public static void main(String[] args) throws Exception {

		int chaveSecretaId = 1;
		ChaveSecretaDao chaveSecretaDao = new ChaveSecretaDao();
		String chaveSecreta = chaveSecretaDao.recuperaSenhaSecreta(chaveSecretaId);
		
		if(chaveSecreta == null) {
			throw new RuntimeException("Secret key not found");
		}
		
		Decriptografa decrypt = new Decriptografa(chaveSecreta);
		
		ExameDao exameDao = new ExameDao(decrypt);
		
		Paciente p = new Paciente();
		p.setId(1);
		

		AlbuminaDto albuminaDto = new AlbuminaDto("g/dL", "20");
		exameDao.insereAlbumina(albuminaDto, p);
		
		int exameId = 1;
		AlbuminaDto albuminaDto1 = exameDao.recuperaExame(exameId);
		System.out.println("Resultado do exame: " + albuminaDto1.getResultado());
		System.out.println("Metrica: " + albuminaDto1.getTipoMetrica());
		
	}

}
