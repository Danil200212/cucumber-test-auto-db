package org.ibs;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class AutoTestDB2 {
    @Owner("Danil Pak")
    @Test
    @DisplayName("Проверка добавления товара, уже существующего в БД")

    public void test() throws SQLException {
        Connection connection = getConnection(
                "jdbc:h2:tcp://localhost:9092/mem:testdb",
                "user",
                "pass");

        Statement statement = connection.createStatement();

/** Проверям список товаров в БД
 */
        System.out.println("Исходная БД:");

        String all = "Select * FROM FOOD";
        ResultSet rs = statement.executeQuery(all);
        while (rs.next()) {
            int FOOD_ID = rs.getInt("FOOD_ID");
            String FOOD_NAME = rs.getString("FOOD_NAME");
            String FOOD_TYPE = rs.getString("FOOD_TYPE");
            int FOOD_EXOTIC = rs.getInt("FOOD_EXOTIC");
            System.out.printf("%d, %s, %s, %d%n", FOOD_ID, FOOD_NAME, FOOD_TYPE, FOOD_EXOTIC);

        }
        System.out.println("============================");

/** Добавляем уже существующий товар в БД
 */
        System.out.println("БД после добавления товара:");

        statement.executeUpdate("INSERT INTO FOOD " +
                "VALUES ('5', 'Апельсин', 'FRUIT', '1')");

        String all1 = "Select * FROM FOOD";
        ResultSet rs1 = statement.executeQuery(all1);
        while (rs1.next()) {
            int FOOD_ID1 = rs1.getInt("FOOD_ID");
            String FOOD_NAME1 = rs1.getString("FOOD_NAME");
            String FOOD_TYPE1 = rs1.getString("FOOD_TYPE");
            int FOOD_EXOTIC1 = rs1.getInt("FOOD_EXOTIC");
            System.out.printf("%d, %s, %s, %d%n", FOOD_ID1, FOOD_NAME1, FOOD_TYPE1, FOOD_EXOTIC1);
        }
        System.out.println("============================");

/** Удаляем товар из БД
 */
        System.out.println("БД после удаления товара:");
        statement.executeUpdate("DELETE FROM FOOD WHERE FOOD_ID = '5'");

        String all2 = "Select * FROM FOOD";
        ResultSet rs2 = statement.executeQuery(all1);
        while (rs2.next()) {
            int FOOD_ID2 = rs2.getInt("FOOD_ID");
            String FOOD_NAME2 = rs2.getString("FOOD_NAME");
            String FOOD_TYPE2 = rs2.getString("FOOD_TYPE");
            int FOOD_EXOTIC2 = rs2.getInt("FOOD_EXOTIC");
            System.out.printf("%d, %s, %s, %d%n", FOOD_ID2, FOOD_NAME2, FOOD_TYPE2, FOOD_EXOTIC2);

        }

    }
}

