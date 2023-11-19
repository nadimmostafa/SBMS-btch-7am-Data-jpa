package org.nadim.generator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator{
	String prefix="OD_YM";
	String suffix = "";
	String sql = "select order_id.nextval from dual";
	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		JdbcConnectionAccess jdbcConnectionAccess = session.getJdbcConnectionAccess();
		
		try {
			Connection con = jdbcConnectionAccess.obtainConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {
				int nextval = rs.getInt(1);
				suffix = String.valueOf(nextval);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return prefix+suffix;
	}

}
