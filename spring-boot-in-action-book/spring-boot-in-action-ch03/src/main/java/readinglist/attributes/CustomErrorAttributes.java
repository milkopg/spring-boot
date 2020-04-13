package readinglist.attributes;

import java.util.Map;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

@Component
public class CustomErrorAttributes extends DefaultErrorAttributes{
	@Override
	public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
		webRequest.setAttribute("foo", "bar", LOWEST_PRECEDENCE);
		return super.getErrorAttributes(webRequest, includeStackTrace);
	}
}
