/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redkalex.gateway;

import java.io.IOException;
import java.util.logging.*;
import org.redkale.net.http.HttpRequest;
import org.redkale.net.http.HttpResponse;
import org.redkale.net.http.HttpServlet;
import org.redkale.net.http.WebServlet;

/**
 * HTTP协议网关
 *
 * @author zhangjx
 */
@WebServlet({"/*"})
public class GatewayServlet extends HttpServlet {

    protected final Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    @Override
    public void execute(HttpRequest request, HttpResponse response) throws IOException {

    }

}
