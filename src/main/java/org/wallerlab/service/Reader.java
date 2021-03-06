package org.wallerlab.service;

import org.springframework.batch.item.*;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.wallerlab.pdbml.v40.generated.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

/**
 * ResourceAwareItemReaderItemStream for reading a pdbml file.
 *
 * @author Christian Ouali Turki
 */
@Service
public class Reader implements ResourceAwareItemReaderItemStream<JAXBElement>{

	private Resource resource;

	public Reader(){}

	/*
	 * Implemented read method.
	 */
	@Override
	public JAXBElement read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		if(resource != null){
			System.out.println("Reading  " + resource);
			JAXBContext jaxbContext = JAXBContext.newInstance("org.wallerlab.pdbml.v40.generated", ObjectFactory.class.getClassLoader());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			JAXBElement pdb =  (JAXBElement)jaxbUnmarshaller.unmarshal(resource.getInputStream());
			this.resource = null;
			return pdb;
		}else{
			return null;
		}
	}

	@Override
	public void setResource(Resource resource) {
		this.resource=resource;
	}

	@Override
	public void open(ExecutionContext executionContext) throws ItemStreamException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ExecutionContext executionContext) throws ItemStreamException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws ItemStreamException {
		// TODO Auto-generated method stub
		
	}

}
