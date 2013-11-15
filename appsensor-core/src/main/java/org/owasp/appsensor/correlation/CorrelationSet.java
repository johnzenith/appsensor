package org.owasp.appsensor.correlation;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CorrelationSet {

	@XmlElement(name="client-application-name")
	private Collection<String> clientApplications;
	
	public Collection<String> getClientApplications() {
		return clientApplications;
	}

	public void setClientApplications(Collection<String> clientApplications) {
		this.clientApplications = clientApplications;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17,31).
				append(clientApplications).
				toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		CorrelationSet other = (CorrelationSet) obj;
		
		return new EqualsBuilder().
				append(clientApplications, other.getClientApplications()).
				isEquals();
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this).
			       append("clientApplications", clientApplications).
			       toString();
	}
	
}
