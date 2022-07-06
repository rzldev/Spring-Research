package com.rzldev.spring.introapp.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class XMLPersonDAO {

    private XMLJDBCConnection jdbcConnection;

    public XMLJDBCConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(XMLJDBCConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
