package btc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import btc.dto.GamesDto;

@Mapper
public interface VueGamesMapper{
	List<GamesDto> vueSelectGamesList() throws Exception;
	
	GamesDto vueSelectDetail(int productId) throws Exception;
	
	void CartInsert(GamesDto gamesDto) throws Exception;
	int isInCart(int productId) throws Exception;
	void addCartItem(int productId) throws Exception;
	int CartQty(int productId) throws Exception;
//	int PlusItemPrice(int productId) throws Exception;
	void MinusCartItem(int productId) throws Exception;
	
	int getCartTotalPrice() throws Exception;
	
	List<GamesDto> CartList() throws Exception;
	
	void CartDelete(int productId) throws Exception;
}
