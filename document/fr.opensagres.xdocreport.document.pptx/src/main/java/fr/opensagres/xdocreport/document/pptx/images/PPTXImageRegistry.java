/**
 * Copyright (C) 2011-2012 The XDocReport Team <xdocreport@googlegroups.com>
 *
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package fr.opensagres.xdocreport.document.pptx.images;

import fr.opensagres.xdocreport.core.io.IEntryOutputStreamProvider;
import fr.opensagres.xdocreport.core.io.IEntryReaderProvider;
import fr.opensagres.xdocreport.core.io.IEntryWriterProvider;
import fr.opensagres.xdocreport.document.images.AbstractImageRegistry;
import fr.opensagres.xdocreport.document.images.ImageProviderInfo;
import fr.opensagres.xdocreport.template.formatter.FieldsMetadata;

/**
 * PPTX image registry.
 * 
 * @author Angelo ZERR
 */
public class PPTXImageRegistry
    extends AbstractImageRegistry
{

    private static final String IMAGE_BASE_PATH = "media/";

    public PPTXImageRegistry( IEntryReaderProvider readerProvider, IEntryWriterProvider writerProvider,
                              IEntryOutputStreamProvider outputStreamProvider, FieldsMetadata fieldsMetadata )
    {
        super( readerProvider, writerProvider, outputStreamProvider, fieldsMetadata );
    }

    protected String getImageBasePath()
    {
        return IMAGE_BASE_PATH;
    }

    @Override
    protected String getPath( ImageProviderInfo info )
    {
        return info.getImageId();
    }

    @Override
    protected String getSize( float sizeAsPixel )
    {
        float sizeAsDxa = sizeAsPixel / 96 * 914400;
        String s = Float.toString( sizeAsDxa );
        // TODO Use DecimalFormat.getIntegerInstance()to format the float to
        // String.
        int dotindex = s.indexOf( '.' );
        if ( dotindex != -1 )
        {
            return s.substring( 0, dotindex );
        }
        return s;
    }
}
