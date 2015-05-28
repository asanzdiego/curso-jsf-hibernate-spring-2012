package app.parejas.modelo;



import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public abstract class AbstractBaseBean implements Comparable<Object>{

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public int compareTo(Object o) {
		return CompareToBuilder.reflectionCompare(this, o);
	}
	
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

}