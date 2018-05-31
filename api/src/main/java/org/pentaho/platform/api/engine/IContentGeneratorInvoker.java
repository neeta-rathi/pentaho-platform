package org.pentaho.platform.api.engine;

public interface IContentGeneratorInvoker {

  IContentGenerator getContentGenerator();

  boolean isSupportedContent( String contentType, String perspectiveName );

}
