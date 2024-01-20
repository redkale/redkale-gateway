/*
 *
 */
package org.redkalex.gateway.filter;

import java.io.IOException;
import org.redkale.annotation.AutoLoad;
import org.redkale.annotation.NonBlocking;
import org.redkale.net.http.HttpFilter;
import org.redkale.net.http.HttpRequest;
import org.redkale.net.http.HttpResponse;

/**
 *
 * @author zhangjx
 */
@NonBlocking
@AutoLoad(false)
public class RateLimiterFilter extends HttpFilter {

    @Override
    public void doFilter(HttpRequest request, HttpResponse response) throws IOException {
        response.nextEvent();
    }

}
