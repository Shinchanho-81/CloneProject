package btc.service;

import java.util.List;

import btc.dto.GamesDto;

public interface VueGamesService {
	List<GamesDto> vueSelectGamesList() throws Exception;
	
	GamesDto vueSelectDetail(int productId) throws Exception;
	
	void CartInsert(GamesDto gamesDto) throws Exception;
	int isInCart(int productId) throws Exception;
	void addCartItem(int productId) throws Exception;
	int CartQty(int productId) throws Exception;
	void MinusCartItem(int productId) throws Exception;
//	int PlusItemPrice(int productId) throws Exception;
	int getCartTotalPrice() throws Exception;
	
	List<GamesDto> CartList() throws Exception;
	
	void CartDelete(int productId) throws Exception;
	
	
}
