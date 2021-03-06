 package no.uio.master.autoscale.message;

import java.io.Serializable;
import java.util.Date;

import no.uio.master.autoscale.message.enumerator.BreachType;

public class BreachMessage<T> extends AbstractMessage implements Serializable {

	private static final long serialVersionUID = -9056720711721903877L;
	private BreachType type;
	private T value;
	private Date date;
	
	@SuppressWarnings("unused")
	private BreachMessage() {
		super();
	}

	public BreachMessage(BreachType t, T v) {
		super();
		type = t;
		value = v;
	}

	public BreachType getType() {
		return type;
	}

	public void setType(BreachType type) {
		this.type = type;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BreachMessage<T> other = (BreachMessage<T>) obj;
		if (type != other.type)
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BreachMessage [type=" + type + ", value=" + value + "], senderIp="+this.getSenderHost();
	}

}
