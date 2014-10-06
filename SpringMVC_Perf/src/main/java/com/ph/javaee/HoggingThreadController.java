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
public class HoggingThreadController {
	
	
	
	public static Object THREAD_LOCK = new Object();
	
	public static final int THREAD_SLEEP_TIME = 30 * 1000;
	
	private static final Logger logger = LoggerFactory.getLogger(HoggingThreadController.class);
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/hoggingThread", method = RequestMethod.GET)
	public String hoggingThread(Locale locale, Model model) {
		logger.info("Hogging Thread Simulator", locale);
		
		try{
			synchronized(THREAD_LOCK){
				Thread.sleep(THREAD_SLEEP_TIME);
			}
			
		}catch (InterruptedException e){
			
		}
		
		return "hoggingThread";
	}
	
}
