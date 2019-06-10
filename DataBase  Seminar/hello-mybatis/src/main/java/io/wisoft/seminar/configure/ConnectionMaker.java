package io.wisoft.seminar.configure;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class ConnectionMaker {

    private static final String RESOURCE_FILE = "mybatis-config.xml";

    private SqlSessionFactory sqlSessionFactory;

    public ConnectionMaker() {
        try {
            final Reader reader = Resources.getResourceAsReader(RESOURCE_FILE);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (final IOException e){
            System.err.println(e.getMessage());
        }
    }

    public SqlSession getSqlSession() {
        return sqlSessionFactory.openSession(false);
    }


    public SqlSession getSqlSession(final ExecutorType executorType) {
        return sqlSessionFactory.openSession(executorType, false);
    }



}
