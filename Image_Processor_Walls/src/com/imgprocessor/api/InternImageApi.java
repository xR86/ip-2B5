package com.imgprocessor.api;

import com.imgprocessor.api.ImageApi;
import com.imgprocessor.controller.DetailsAppendListener;
import com.imgprocessor.controller.ProgressChangedListener;
import com.imgprocessor.model.ImageProcessedRepresentation;
import com.imgprocessor.processor.ImageProcessor;
import com.imgprocessor.processor.ProcessingException;
import com.imgprocessor.processor.TruncatingException;
import com.imgprocessor.processor.ValidatingException;

/**
 * 
 */
public class InternImageApi implements ImageApi {

    /**
     * Default constructor
     */
    public InternImageApi() {
    }

    /**
     * 
     */
    public ImageProcessor processor;
    


	@Override
	public void processImage(String filePath) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public ImageProcessedRepresentation getImageProcessedRepresentation()
			throws ValidatingException, TruncatingException, ProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImageProcessor getImageProcessor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addProgressChangedListener(ProgressChangedListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProgressChangedListener(ProgressChangedListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDetailsAppendListener(DetailsAppendListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDetailsAppendListener(DetailsAppendListener listener) {
		// TODO Auto-generated method stub
		
	}



}