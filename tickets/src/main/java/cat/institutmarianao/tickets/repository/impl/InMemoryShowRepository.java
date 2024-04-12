package cat.institutmarianao.tickets.repository.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cat.institutmarianao.tickets.domain.Show;
import cat.institutmarianao.tickets.repository.ShowRepository;

public class InMemoryShowRepository implements ShowRepository {

	private final Map<String, Show> shows = new HashMap<>();

	public InMemoryShowRepository() {
		Show u2 = new Show("1", "U2 360 Tour", 5);
		u2.setLocation("Palau Sant Jordi");

		Show burana = new Show("2", "Carmina Burana", 3);
		burana.setLocation("Palau de la musica");
		shows.put("1", u2);
		shows.put("2", burana);
	}

	@Override
	public Collection<Show> getAllShows() {
		return shows.values();
	}

	@Override
	public Show makeReservation(String showId) {
		Show reservation = shows.get(showId);
		reservation.makeTicketReservation();
		return reservation;
	}

	@Override
	public Show cancelReservation(String showId) {
		Show reservation = shows.get(showId);
		reservation.makeTicketCancellation();
		return reservation;
	}
}
