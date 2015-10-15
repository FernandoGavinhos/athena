package br.com.athena.mvc.controller.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ServletImpl {
    String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception;
}