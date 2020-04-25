package com.sapient.refdata.service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sapient.refdata.service.enumation.Side;
import com.sapient.refdata.service.enumation.TradeStatus;

@Entity
@Table(name="trades")
public class TradesEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tradeId;
	private Side side;
	private Integer quantity;
	private Double price;
	private TradeStatus status;
	
	@ManyToOne
	@JoinColumn(name = "commodity_id")
	private CommodityEntity commodityId;
	
	@ManyToOne
	@JoinColumn(name = "counterparty_id")
	private CounterpartyEntity counterpartyId;
	
	@ManyToOne
	@JoinColumn(name = "location_id")
	private LocationEntity locationId;
	
	public TradesEntity() {}

	public TradesEntity(Integer tradeId, Side side, Integer quantity, Double price, TradeStatus status,
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
