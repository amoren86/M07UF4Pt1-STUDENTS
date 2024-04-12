package cat.institutmarianao.tickets.domain;

import java.io.Serializable;
import java.util.Objects;

public class Show implements Serializable {
	private static final long serialVersionUID = -7749402514115197055L;

	private String id;
	private String name;
	private String location;
	private final Integer totalTickets;
	private Integer availableTickets;

	public Show() {
		totalTickets = 0;
	}

	public Show(String id, String name, int totalTickets) {
		this.id = id;
		this.name = name;
		this.totalTickets = totalTickets;
		availableTickets = totalTickets;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getAvailableTickets() {
		return availableTickets;
	}

	public void setAvailableTickets(Integer availableTickets) {
		this.availableTickets = availableTickets;
	}

	public void makeTicketReservation() {
		if (availableTickets > 0) {
			availableTickets--;
		} else {
			throw new IllegalArgumentException("No more tickets available!");
		}
	}

	public void makeTicketCancellation() {
		if (availableTickets < totalTickets) {
			availableTickets++;
		} else {
			throw new IllegalArgumentException("There is no tickets to cancel!");
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Show)) {
			return false;
		}
		Show other = (Show) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Show [id=" + id + ", name=" + name + ", available tickets=" + availableTickets + "]";
	}
}
