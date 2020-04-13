package readinglist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import readinglist.amazon.AmazonProperties;
import readinglist.model.Book;
import readinglist.model.Reader;
import readinglist.repository.ReadingListRepository;

@Controller
@RequestMapping("/")
@ConfigurationProperties(prefix = "amazon")
public class ReadingListController {
	
	private String associateId;
	
	private ReadingListRepository readingListRepository;
	
	private AmazonProperties amazonConfig;

	@Autowired
	public ReadingListController(ReadingListRepository readingListRepository) {
		this.readingListRepository = readingListRepository;
	}
	
	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/fail")
	public void fail() {
	  throw new RuntimeException();
	}
	
	@ExceptionHandler(value=RuntimeException.class)
	@ResponseStatus(value=HttpStatus.BANDWIDTH_LIMIT_EXCEEDED)
	public String error() {
	  return "error";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String readerBooks(Reader reader, Model model) {
		List<Book> readingList = readingListRepository.findByReader(reader);
		if (readingList != null) {
			model.addAttribute("books", readingList);
			model.addAttribute("reader", reader);
			model.addAttribute("amazonID", amazonConfig.getAssociateId());
		}
		return "readingList";
	}

	@RequestMapping(method =  RequestMethod.POST)
	public String addToReadingList(Reader reader, Book book ) {
		book.setReader(reader);
		readingListRepository.save(book);
		return "redirect:/";
	}
}
