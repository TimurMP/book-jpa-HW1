package telran.java2022.book.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "publisherName")
@Entity
//@ToString(includeFieldNames = false, doNotUseGetters = true)



public class Publisher implements Serializable{

	private static final long serialVersionUID = 5083976659882404642L;
	
	@Id
	String publisherName;

	@Override
	public String toString() {
		return publisherName;
	}
}


