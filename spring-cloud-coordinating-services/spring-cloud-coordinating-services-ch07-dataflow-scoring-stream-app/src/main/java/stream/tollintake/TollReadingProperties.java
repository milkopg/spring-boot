package stream.tollintake;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties("fraud")
@Validated
public class TollReadingProperties {

	/**
	 * The limit before we worry about actual fraud.
	 */
	private Integer fraudThresshold = 10;

	public Integer getFraudThresshold() {
		return fraudThresshold;
	}

	public void setFraudThresshold(Integer fraudThresshold) {
		this.fraudThresshold = fraudThresshold;
	}

}
