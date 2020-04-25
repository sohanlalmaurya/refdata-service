package com.sapient.refdata.service.model;

import com.sapient.refdata.service.enumation.Side;
import com.sapient.refdata.service.enumation.TradeStatus;

public class TradesModel {

	private Integer tradeId;
	private Side side;
	private Integer quantity;
	private Double price;
	private TradeStatus status;

	private CommodityModel commodity;

	private CounterpartyModel counterparty;

	private LocationModel location;

	public TradesModel() {
	}

	public TradesModel(Integer tradeId, Side side, Integer quantity, Double price, TradeStatus status,
			CommodityModel commodity, CounterpartyModel counterparty, LocationModel location) {
		super();
		this.tradeId = tradeId;
		this.side = side;
		this.quantity = quantity;
		this.price = price;
		this.status = status;
		this.commodity = commodity;
		this.counterparty = counterparty;
		this.location = location;
	}

	public Integer getTradeId() {
		return tradeId;
	}

	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public TradeStatus getStatus() {
		return status;
	}

	public void setStatus(TradeStatus status) {
		this.status = status;
	}

	public CommodityModel getCommodity() {
		return commodity;
	}

	public void setCommodity(CommodityModel commodity) {
		this.commodity = commodity;
	}

	public CounterpartyModel getCounterparty() {
		return counterparty;
	}

	public void setCounterparty(CounterpartyModel counterparty) {
		this.counterparty = counterparty;
	}

	public LocationModel getLocation() {
		return location;
	}

	public void setLocation(LocationModel location) {
		this.location = location;
	}

	public static class CommodityModel {
		private Integer id;
		private String name;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	public static class CounterpartyModel {
		private Integer id;
		private String name;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	public static class LocationModel {
		private Integer id;
		private String name;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}
