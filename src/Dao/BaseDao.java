package Dao;

import java.sql.SQLException;
import java.util.List;

/*
 * DAO 基础接口
 * @param <T> 数据实体类型
 */
public interface BaseDao<T> {
    boolean insert(T entity) throws SQLException;

    boolean update(T entity) throws SQLException;

    boolean delete(Object id) throws SQLException;

    T findById(Object id) throws SQLException;

    List<T> findAll() throws SQLException;
}
