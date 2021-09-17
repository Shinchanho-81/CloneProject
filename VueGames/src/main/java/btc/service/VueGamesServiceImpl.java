package btc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import btc.dto.GamesDto;
import btc.mapper.VueGamesMapper;

@Service
public class VueGamesServiceImpl implements VueGamesService {

	@Autowired
	private VueGamesMapper vgMapper;
	
	@Override
	public List<GamesDto> vueSelectGamesList() throws Exception {
		return vgMapper.vueSelectGamesList();
	}
	
	@Override
	public GamesDto vueSelectDetail(int productId) throws Exception {
		return vgMapper.vueSelectDetail(productId);
	}

	@Override
	public void CartInsert(GamesDto gamesDto) throws Exception {
		vgMapper.CartInsert(gamesDto);
	}
	
	@Override
	public int isInCart(int productId) throws Exception {
		return vgMapper.isInCart(productId);
	}

	@Override
	public void addCartItem(int productId) throws Exception {
		vgMapper.addCartItem(productId);	
	}
	
	@Override
	public int CartQty(int productId) throws Exception {
		return vgMapper.CartQty(productId);
	}
	
	@Override
	public void MinusCartItem(int productId) throws Exception {
		vgMapper.MinusCartItem(productId);
	}
	
//	@Override
//	public int PlusItemPrice(int productId) throws Exception {
//		return vgMapper.PlusItemPrice(productId);
//	}
	
	@Override
	public int getCartTotalPrice() throws Exception {
		return vgMapper.getCartTotalPrice();
	}

	@Override
	public List<GamesDto> CartList() throws Exception {
		return vgMapper.CartList();
	}

	@Override
	public void CartDelete(int productId) throws Exception {
		vgMapper.CartDelete(productId);
		
	}
	
}
