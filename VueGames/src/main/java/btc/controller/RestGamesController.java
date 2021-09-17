package btc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import btc.dto.GamesDto;
import btc.service.VueGamesService;

@RestController
public class RestGamesController {
	
	@Autowired
	private VueGamesService vgService;
	
	@RequestMapping(value="/vue/axiosGamesList", method=RequestMethod.GET)
	public Object vueSelectBoardList() throws Exception {
		List<GamesDto> dataList = vgService.vueSelectGamesList();
		
		return dataList;
	}
	
	@RequestMapping(value="/vue/axiosGamesDetail", method=RequestMethod.GET)
	public Object vueSelectDetail(@RequestParam("productId")int productId) throws Exception {
		GamesDto data = vgService.vueSelectDetail(productId);
		
		return data;
	}
	
	@RequestMapping(value="/vue/axiosCartInsert", method=RequestMethod.POST)
	public void CartInsert(@RequestBody GamesDto gamesDto) throws Exception {
		vgService.CartInsert(gamesDto);
	}
	
	//	īƮ �߰� �� īƮ�� �ߺ� �������� �ִ��� ���� äũ
	@RequestMapping(value="/vue/IsInCart", method=RequestMethod.GET)
	public int isInCart(@RequestParam("productId") int productId) throws Exception {
		return vgService.isInCart(productId);
	}
	
	//	�ߺ��� ������ cart ���̺��� cart_count�� 1���� ��Ű�� �޼ҵ�
	@RequestMapping(value="/vue/AddCartItem", method=RequestMethod.PUT)
	public void addCartItem(@RequestParam("productId") int productId) throws Exception {
		vgService.addCartItem(productId);
	}
	
	//  īƮ ������ ���� Ȯ��
	@RequestMapping(value="/vue/cartQty", method=RequestMethod.GET)
	public int CartQty(@RequestParam("productId") int productId) throws Exception {
		return vgService.CartQty(productId);
	}
	
	// �ߺ� ������ ���� ����
	@RequestMapping(value="/vue/MinusCartItem", method=RequestMethod.PUT)
	public void MinusCartItem(@RequestParam("productId") int productId) throws Exception {
		vgService.MinusCartItem(productId);
	}
	
//	// �ߺ� ������ ��������
//	@RequestMapping(value="/vue/PlusItemPrice", method=RequestMethod.GET)
//	public int PlusItemPrice(@RequestParam("productId") int productId) throws Exception {
//		return vgService.PlusItemPrice(productId);
//	}
	
	//	īƮ �� ����
	@RequestMapping(value="/vue/getCartTotalPrice", method=RequestMethod.GET)
	public int getCartTotalPrice() throws Exception {
		return vgService.getCartTotalPrice();
	}
	
	@RequestMapping(value="/vue/axiosCartList", method=RequestMethod.GET)
	public Object CartList() throws Exception {
		List<GamesDto> List = vgService.CartList();
		
		return List;
	}
	
	@RequestMapping(value="/vue/axiosCartDelete", method=RequestMethod.DELETE)
	public void CartDelete(@RequestParam("productId") int productId) throws Exception {
		vgService.CartDelete(productId);
	}
	
}
