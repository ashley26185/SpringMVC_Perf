package com.ph.javaee;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class StuckThreadController {
	
	
	
	public static Object THREAD_LOCK = new Object();
	
	public static final int THREAD_SLEEP_TIME = 90 * 1000;
	
	private static final Logger logger = LoggerFactory.getLogger(StuckThreadController.class);
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/stuckThread", method = RequestMethod.GET)
	public String stuckThread(Locale locale, Model model) {
		logger.info("Stuck Thread Simulator", locale);
		
		try{
			
				Thread.sleep(THREAD_SLEEP_TIME);
			
			
		}catch (InterruptedException e){
			
		}
		
		return "stuckThread";
	}
	
}
