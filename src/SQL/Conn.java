package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Yihan Wan
 */

public final class Conn {
    private static final Logger logger = Logger.getLogger(Conn.class.getName());
    private static final String URL = "jdbc:mysql://localhost:3306/vCampus?serverTimezone=UTC";
    private static final String USERNAME = "DbUser";
    private static final String PASSWORD = "123456";

    /*
     * 连接数据库
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            logger.info("数据库成功连接。");
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "连接数据库失败", e);
            throw new RuntimeException("连接数据库失败", e);
        }
        return conn;
    }

    /*
     * 关闭数据库
     */
    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
                logger.info("数据库连接已关闭。");
            } catch (SQLException e) {
                logger.log(Level.SEVERE, "关闭数据库连接失败", e);
                throw new RuntimeException("关闭数据库连接失败", e);
            }
        }
    }

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = getConnection();
        } finally {
            closeConnection(conn);
        }
    }
}
