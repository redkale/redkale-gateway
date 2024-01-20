/*

 */

package org.redkalex.gateway;

import java.io.IOException;
import java.util.logging.Logger;
import org.redkale.net.http.HttpRequest;
import org.redkale.net.http.HttpResponse;
import org.redkale.net.http.HttpServlet;

/**
 *
 * @author zhangjx
 */
public class RouteServlet extends HttpServlet {

    protected final Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    @Override
    public void execute(HttpRequest request, HttpResponse response) throws IOException {

    }
}
