package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import comparableXcomparator.Main;

public class AgendaEventos {

	private Map<LocalDate,Evento> mapEventos;
	
	AgendaEventos(){
		mapEventos = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		mapEventos.put(data, new Evento (nome, atracao));
	}
	
	public Map<LocalDate,Evento> exibirAgendaCrescente() {
		Map<LocalDate,Evento> eventOrdemCrescente = new TreeMap<>(mapEventos);
		return eventOrdemCrescente;
	}
	
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		LocalDate  proxData = null;
		Evento proxEvento = null;
		for(Map.Entry<LocalDate, Evento> entry : exibirAgendaCrescente().entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proxData = entry.getKey();
				proxEvento = entry.getValue();
				System.out.println("O próximo evento: " + proxEvento + " acontecerá na data: " + proxData);
			}
		}
		
	}
	
	public static void main(String[] args) {
		 AgendaEventos agendaEventos = new AgendaEventos();

		    // Adiciona eventos à agenda
		    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
		    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
		    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
		    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
		    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
		    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 27), "Enur", "Encontro Nacional Universidades Renovadas");

		    // Exibe a agenda completa de eventos
		    System.out.println(agendaEventos.exibirAgendaCrescente());

		    // Obtém e exibe o próximo evento na agenda
		    agendaEventos.obterProximoEvento();
	}
	
	
}


