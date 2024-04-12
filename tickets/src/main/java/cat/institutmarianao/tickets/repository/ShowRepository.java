package cat.institutmarianao.tickets.repository;

import java.util.Collection;

import cat.institutmarianao.tickets.domain.Show;

public interface ShowRepository {
	Collection<Show> getAllShows();

	Show makeReservation(String showId);

	Show cancelReservation(String showId);
}
