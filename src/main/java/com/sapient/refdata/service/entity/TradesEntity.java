package com.sapient.refdata.service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sapient.refdata.service.enumation.Side;
import com.sapient.refdata.service.enumation.TradeStatus;

@Entity
@Table(name="trades")
public class TradesEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String tradeId;
	private Side side;
	private Integer quantity;
	private Double price;
	private TradeStatus status;
	
	@ManyToOne
	private CommodityEntity commodityId;
	
	@ManyToOne
	private CounterpartyEntity counterpartyId;
	
	@ManyToOne
	private LocationEntity locationId;
	
	public TradesEntity() {}

	public TradesEntity(String tradeId, Side side, Integer quantity, Double price, TradeStatus status,
			CommodityEntity commodityId, CounterpartyEntity counterpartyId, LocationEntity locationId) {
		super();
		this.tradeId = tradeId;
		this.side = side;
		this.quantity = quantity;
		this.price = price;
		this.status = status;
		this.commodityId = commodityId;
		this.counterpartyId = counterpartyId;
		this.locationId = locationId;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
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


	public CommodityEntity getCommodityId() {
		return commodityId;
	}


	public void setCommodityId(CommodityEntity commodityId) {
		this.commodityId = commodityId;
	}


	public CounterpartyEntity getCounterpartyId() {
		return counterpartyId;
	}


	public void setCounterpartyId(CounterpartyEntity counterpartyId) {
		this.counterpartyId = counterpartyId;
	}


	public LocationEntity getLocationId() {
		return locationId;
	}


	public void setLocationId(LocationEntity locationId) {
		this.locationId = locationId;
	}
	
}
