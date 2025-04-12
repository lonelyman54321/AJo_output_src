/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import com.ril.ajio.services.data.Cart.CartItem;
import com.ril.ajio.services.data.Cart.NetPrice;
import com.ril.ajio.services.data.Cart.ReturnExchangeCtaMessageList;
import com.ril.ajio.services.data.Cart.ServicabilityInfo;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.returnexchange.TotalPrice;
import com.ril.ajio.services.data.sis.DropAtStore;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CartEntry
implements CartItem,
Serializable,
Comparable {
    private long actualDealStartTime;
    private String age;
    private String aggregateRating;
    private ArrayList allPromotionsList;
    private String amount;
    private Float averageRating;
    private Double bankDiscountPromoAmt;
    private String barCode;
    private Price basePrice;
    private double bundleDiscountAmount;
    private String cancelComments;
    private String cancelReqTimestamp;
    private String canceledTimestamp;
    private Set cartAppliedPromotionInfoList;
    private long cartId;
    private Set cartPotentialPromotionInfoList;
    private List cartPromotionInfoList;
    private String code;
    private String commentsHint;
    private String consignmentCode;
    private int consignmentCount;
    private ConvenienceFeePriceSplitUp convenienceFee;
    private String ctaMessage;
    private boolean dealEnabled;
    private long dealEndTime;
    private String dealType;
    private String deliverySLA;
    private Object deliveryTagName;
    private DropAtStore dropAtStore;
    private boolean dropAtStoreAvailable;
    private String eddDate;
    private String eddFormattedDate;
    private String eddUpper;
    private Integer entryNumber;
    private String entryStatus;
    private String entryStatusDisplay;
    private String entryStatusMessage;
    private int exchangeEditedQuantity;
    private String exchangeId;
    private String experimentId;
    private Object giftProducts;
    private Integer giftProductsCount;
    private Integer giftQuantity;
    private ArrayList imageInfoList;
    private Integer inventoryQty;
    private boolean isAjioFaultReturnFee;
    private boolean isBundleOfferApplicable;
    private Boolean isCancellable;
    private boolean isConvenienceFeeEnabled;
    private boolean isExchangeEligible;
    private boolean isExchangeEligibleAtProdLevel;
    private boolean isExchangeItem;
    private boolean isExchangeable;
    private Boolean isGiftProduct;
    private Boolean isPriorityDeliveryApplied;
    private Boolean isPriorityDeliveryBreached;
    private boolean isProductNS;
    private boolean isProductNSForGA;
    private boolean isQuantityAvailable;
    private boolean isReturnClicked;
    private boolean isReturnEligible;
    private boolean isReturnEligibleAtprodLevel;
    private boolean isReturnItem;
    private boolean isReturnable;
    private boolean isSelected;
    private boolean isStockUpdate;
    private boolean isTagAvailable;
    private int listPosition;
    private TotalPrice luxeTotalPrice;
    private String multiItemPromoAmt;
    private NetPrice netPrice;
    private String newEntryStatus;
    private String newEntryStatusDisplay;
    private String newEntryStatusMessage;
    private String numUserRatings;
    private String orderBucket;
    private String orderCreatedDate;
    private CartEntry orderEntry;
    private String orderId;
    private Integer orderTotalQuantity;
    private boolean pickFromStoreAvailable;
    private long premiumDealStartTime;
    private int priceDrop;
    private int priceIncrease;
    private String priorityDeliveryDate;
    private String priorityDeliveryFeeStatus;
    private Product product;
    private String productCode;
    private Long productId;
    private List productSimilarList;
    private boolean productTag;
    private Integer quantity;
    private int quantityIndex;
    private int quantityToBeUpdated;
    private String reason;
    private String reasonForNotServiceability;
    private int reasonIndex;
    private ArrayList refundOptions;
    private int returnEditedQuantity;
    private ReturnExchangeCtaMessageList returnExchangeCtaMessageList;
    private String returnExchangeErrorMessage;
    private String returnFee;
    private String returnId;
    private CartEntry returnOrderEntry;
    private int returnWindow;
    private int returnedQty;
    private String segmentId;
    private boolean servicability;
    private ServicabilityInfo servicabilityInfo;
    private String shipmentCode;
    private int shipmentPosition;
    private Double shippingChargePromoAmt;
    private String sourceStoreId;
    private int status;
    private String subReason;
    private String subreasonIndex;
    private ArrayList tags;
    private NetPrice totalBasePrice;
    private NetPrice totalDiscountAmount;
    private Float totalDiscountPercentage;
    private int totalEntryCount;
    private NetPrice totalListPrice;
    private Price totalPrice;
    private NetPrice totalPromoAmount;
    private NetPrice totalSavingAmount;
    private NetPrice totalVoucherAmount;
    private boolean updateable;
    private String voucherMessages;
    private String voucherPromoAmt;
    private String wrongItemComments;

    public CartEntry() {
        long l2;
        int n3 = -1;
        AbstractCollection abstractCollection = n3;
        this.inventoryQty = abstractCollection;
        abstractCollection = "";
        this.entryStatus = abstractCollection;
        this.entryStatusDisplay = abstractCollection;
        this.entryStatusMessage = abstractCollection;
        this.newEntryStatus = abstractCollection;
        this.newEntryStatusDisplay = abstractCollection;
        this.newEntryStatusMessage = abstractCollection;
        this.isStockUpdate = false;
        this.dealEnabled = false;
        this.actualDealStartTime = l2 = 0L;
        this.dealEndTime = l2;
        this.premiumDealStartTime = l2;
        this.productTag = false;
        this.ctaMessage = null;
        this.isProductNS = false;
        this.isProductNSForGA = false;
        this.isQuantityAvailable = true;
        this.isConvenienceFeeEnabled = false;
        this.isReturnClicked = false;
        abstractCollection = 0;
        this.giftQuantity = abstractCollection;
        abstractCollection = Boolean.FALSE;
        this.isGiftProduct = abstractCollection;
        this.multiItemPromoAmt = "0.0";
        this.cartAppliedPromotionInfoList = abstractCollection = new AbstractCollection();
        this.cartPotentialPromotionInfoList = abstractCollection = new AbstractCollection();
        this.allPromotionsList = abstractCollection;
        this.status = n3;
    }

    public CartEntry(Integer n3, Integer n4, boolean bl2, long l2, Long l3) {
        long l4;
        int n7 = -1;
        AbstractCollection abstractCollection = n7;
        this.inventoryQty = abstractCollection;
        abstractCollection = "";
        this.entryStatus = abstractCollection;
        this.entryStatusDisplay = abstractCollection;
        this.entryStatusMessage = abstractCollection;
        this.newEntryStatus = abstractCollection;
        this.newEntryStatusDisplay = abstractCollection;
        this.newEntryStatusMessage = abstractCollection;
        this.isStockUpdate = false;
        this.dealEnabled = false;
        this.actualDealStartTime = l4 = 0L;
        this.dealEndTime = l4;
        this.premiumDealStartTime = l4;
        this.productTag = false;
        this.ctaMessage = null;
        this.isProductNS = false;
        this.isProductNSForGA = false;
        this.isQuantityAvailable = true;
        this.isConvenienceFeeEnabled = false;
        this.isReturnClicked = false;
        abstractCollection = 0;
        this.giftQuantity = abstractCollection;
        abstractCollection = Boolean.FALSE;
        this.isGiftProduct = abstractCollection;
        this.multiItemPromoAmt = "0.0";
        this.cartAppliedPromotionInfoList = abstractCollection = new AbstractCollection();
        this.cartPotentialPromotionInfoList = abstractCollection = new AbstractCollection();
        this.allPromotionsList = abstractCollection;
        this.status = n7;
        this.entryNumber = n3;
        this.quantity = n4;
        this.updateable = bl2;
        this.cartId = l2;
        this.productId = l3;
    }

    private List getCartPromotionInfoList() {
        return this.cartPromotionInfoList;
    }

    public int compareTo(CartEntry comparable) {
        Integer n3 = this.entryNumber;
        if (n3 == null) {
            return -1;
        }
        comparable = comparable.entryNumber;
        if (comparable == null) {
            return 1;
        }
        return n3.compareTo((Integer)comparable);
    }

    public long getActualDealStartTime() {
        return this.actualDealStartTime;
    }

    public String getAdditionalPromotionalMessage() {
        boolean bl2;
        Object object = this.getCartPromotionInfoList();
        if (object != null && !(bl2 = (object = this.getCartPromotionInfoList()).isEmpty())) {
            int n3;
            object = new StringBuilder();
            List list = this.getCartPromotionInfoList();
            int n4 = 0;
            if (list != null) {
                list = this.getCartPromotionInfoList();
                n3 = list.size();
            } else {
                n3 = 0;
                list = null;
            }
            while (n4 < n3) {
                String string2 = n4 > 0 ? ",\n" : "";
                ((StringBuilder)object).append(string2);
                string2 = this.getCartPromotionInfoList().get(n4);
                ((StringBuilder)object).append((Object)string2);
                ++n4;
            }
            return ((StringBuilder)object).toString();
        }
        return null;
    }

    public String getAge() {
        return this.age;
    }

    public String getAggregateRating() {
        return this.aggregateRating;
    }

    public ArrayList getAllPromotionsList() {
        return this.allPromotionsList;
    }

    public String getAmount() {
        return this.amount;
    }

    public Float getAverageRating() {
        return this.averageRating;
    }

    public Double getBankDiscountPromoAmt() {
        return this.bankDiscountPromoAmt;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public Price getBasePrice() {
        return this.basePrice;
    }

    public double getBundleDiscountAmount() {
        return this.bundleDiscountAmount;
    }

    public String getCancelComments() {
        return this.cancelComments;
    }

    public String getCancelReqTimestamp() {
        return this.cancelReqTimestamp;
    }

    public String getCanceledTimestamp() {
        return this.canceledTimestamp;
    }

    public Boolean getCancellable() {
        return this.isCancellable;
    }

    public Set getCartAppliedPromotionInfoList() {
        return this.cartAppliedPromotionInfoList;
    }

    public long getCartId() {
        return this.cartId;
    }

    public Set getCartPotentialPromotionInfoList() {
        return this.cartPotentialPromotionInfoList;
    }

    public String getCode() {
        return this.code;
    }

    public String getCommentsHint() {
        boolean bl2;
        String string2 = this.commentsHint;
        if (string2 == null || (bl2 = string2.isEmpty())) {
            this.commentsHint = string2 = "Comments(optional)";
        }
        return this.commentsHint;
    }

    public String getConsignmentCode() {
        return this.consignmentCode;
    }

    public int getConsignmentCount() {
        return this.consignmentCount;
    }

    public ConvenienceFeePriceSplitUp getConvenienceFee() {
        return this.convenienceFee;
    }

    public String getCtaMessage() {
        return this.ctaMessage;
    }

    public long getDealEndTime() {
        return this.dealEndTime;
    }

    public String getDealType() {
        return this.dealType;
    }

    public String getDeliverySLA() {
        return this.deliverySLA;
    }

    public Object getDeliveryTagName() {
        return this.deliveryTagName;
    }

    public DropAtStore getDropAtStore() {
        return this.dropAtStore;
    }

    public String getEddDate() {
        return this.eddDate;
    }

    public String getEddFormattedDate() {
        return this.eddFormattedDate;
    }

    public String getEddUpper() {
        return this.eddUpper;
    }

    public Integer getEntryNumber() {
        return this.entryNumber;
    }

    public String getEntryStatus() {
        return this.entryStatus;
    }

    public String getEntryStatusDisplay() {
        return this.entryStatusDisplay;
    }

    public String getEntryStatusMessage() {
        return this.entryStatusMessage;
    }

    public int getExchangeEditedQuantity() {
        return this.exchangeEditedQuantity;
    }

    public String getExchangeId() {
        return this.exchangeId;
    }

    public String getExperimentId() {
        return this.experimentId;
    }

    public Object getGiftProducts() {
        return this.giftProducts;
    }

    public Integer getGiftProductsCount() {
        return this.giftProductsCount;
    }

    public Integer getGiftQuantity() {
        return this.giftQuantity;
    }

    public ArrayList getImageInfoList() {
        return this.imageInfoList;
    }

    public Integer getInventoryQty() {
        return this.inventoryQty;
    }

    public boolean getIsExchangeItem() {
        return this.isExchangeItem;
    }

    public boolean getIsReturnItem() {
        return this.isReturnItem;
    }

    public int getListPosition() {
        return this.listPosition;
    }

    public TotalPrice getLuxeTotalPrice() {
        return this.luxeTotalPrice;
    }

    public String getMultiItemPromoAmt() {
        return this.multiItemPromoAmt;
    }

    public NetPrice getNetPrice() {
        return this.netPrice;
    }

    public String getNewEntryStatus() {
        return this.newEntryStatus;
    }

    public String getNewEntryStatusDisplay() {
        return this.newEntryStatusDisplay;
    }

    public String getNewEntryStatusMessage() {
        return this.newEntryStatusMessage;
    }

    public String getNumUserRatings() {
        return this.numUserRatings;
    }

    public String getOrderBucket() {
        return this.orderBucket;
    }

    public String getOrderCreatedDate() {
        return this.orderCreatedDate;
    }

    public CartEntry getOrderEntry() {
        return this.orderEntry;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public Integer getOrderTotalQuantity() {
        Integer n3 = this.orderTotalQuantity;
        if (n3 == null) {
            n3 = this.getQuantity();
        }
        return n3;
    }

    public long getPremiumDealStartTime() {
        return this.premiumDealStartTime;
    }

    public int getPriceDrop() {
        return this.priceDrop;
    }

    public int getPriceIncrease() {
        return this.priceIncrease;
    }

    public Boolean getPriorityDeliveryApplied() {
        return this.isPriorityDeliveryApplied;
    }

    public Boolean getPriorityDeliveryBreached() {
        return this.isPriorityDeliveryBreached;
    }

    public String getPriorityDeliveryDate() {
        return this.priorityDeliveryDate;
    }

    public String getPriorityDeliveryFeeStatus() {
        return this.priorityDeliveryFeeStatus;
    }

    public Product getProduct() {
        return this.product;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public Long getProductId() {
        return this.productId;
    }

    public List getProductSimilarList() {
        return this.productSimilarList;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public int getQuantityIndex() {
        return this.quantityIndex;
    }

    public int getQuantityToBeUpdated() {
        return this.quantityToBeUpdated;
    }

    public String getReason() {
        return this.reason;
    }

    public String getReasonForNotServiceability() {
        return this.reasonForNotServiceability;
    }

    public int getReasonIndex() {
        return this.reasonIndex;
    }

    public ArrayList getRefundOptions() {
        return this.refundOptions;
    }

    public int getReturnEditedQuantity() {
        return this.returnEditedQuantity;
    }

    public ReturnExchangeCtaMessageList getReturnExchangeCtaMessageList() {
        return this.returnExchangeCtaMessageList;
    }

    public String getReturnExchangeErrorMessage() {
        return this.returnExchangeErrorMessage;
    }

    public String getReturnFee() {
        return this.returnFee;
    }

    public String getReturnId() {
        return this.returnId;
    }

    public CartEntry getReturnOrderEntry() {
        return this.returnOrderEntry;
    }

    public int getReturnWindow() {
        return this.returnWindow;
    }

    public int getReturnedQty() {
        return this.returnedQty;
    }

    public String getSegmentId() {
        return this.segmentId;
    }

    public ServicabilityInfo getServicabilityInfo() {
        return this.servicabilityInfo;
    }

    public String getShipmentCode() {
        return this.shipmentCode;
    }

    public int getShipmentPosition() {
        return this.shipmentPosition;
    }

    public Double getShippingChargePromoAmt() {
        return this.shippingChargePromoAmt;
    }

    public String getSourceStoreId() {
        return this.sourceStoreId;
    }

    public int getStatus() {
        return this.status;
    }

    public String getSubReason() {
        return this.subReason;
    }

    public String getSubreasonIndex() {
        return this.subreasonIndex;
    }

    public ArrayList getTags() {
        return this.tags;
    }

    public NetPrice getTotalBasePrice() {
        return this.totalBasePrice;
    }

    public NetPrice getTotalDiscountAmount() {
        return this.totalDiscountAmount;
    }

    public Float getTotalDiscountPercentage() {
        return this.totalDiscountPercentage;
    }

    public int getTotalEntryCount() {
        return this.totalEntryCount;
    }

    public NetPrice getTotalListPrice() {
        return this.totalListPrice;
    }

    public Price getTotalPrice() {
        return this.totalPrice;
    }

    public NetPrice getTotalPromoAmount() {
        return this.totalPromoAmount;
    }

    public NetPrice getTotalSavingAmount() {
        return this.totalSavingAmount;
    }

    public NetPrice getTotalVoucherAmount() {
        return this.totalVoucherAmount;
    }

    public boolean getUpdateable() {
        return this.updateable;
    }

    public String getVoucherMessages() {
        return this.voucherMessages;
    }

    public String getVoucherPromoAmt() {
        return this.voucherPromoAmt;
    }

    public String getWrongItemComments() {
        return this.wrongItemComments;
    }

    public boolean inventoryQtyUpdateNeeded() {
        Integer n3;
        int n4;
        Integer n7 = this.inventoryQty;
        int n8 = n7;
        if (n8 != (n4 = -1) && (n8 = (n7 = this.quantity).intValue()) > (n4 = (n3 = this.inventoryQty).intValue())) {
            n8 = 1;
        } else {
            n8 = 0;
            n7 = null;
        }
        return n8 != 0;
    }

    public boolean isAjioFaultReturnFee() {
        return this.isAjioFaultReturnFee;
    }

    public boolean isBundleOfferApplicable() {
        return this.isBundleOfferApplicable;
    }

    public boolean isConvenienceFeeEnabled() {
        return this.isConvenienceFeeEnabled;
    }

    public boolean isDealEnabled() {
        return this.dealEnabled;
    }

    public boolean isDropAtStoreAvailable() {
        return this.dropAtStoreAvailable;
    }

    public boolean isEmpty() {
        boolean bl2;
        Object object = this.entryNumber;
        if (object == null && (object = this.entryStatus) == null && (object = this.entryStatusMessage) == null && (object = this.quantity) == null && (object = this.productId) == null && (object = this.product) == null && (object = this.basePrice) == null && (object = this.totalPrice) == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean isExchangeEligible() {
        return this.isExchangeEligible;
    }

    public boolean isExchangeEligibleAtProdLevel() {
        return this.isExchangeEligibleAtProdLevel;
    }

    public boolean isExchangeItem() {
        return this.isExchangeItem;
    }

    public boolean isExchangeable() {
        return this.isExchangeable;
    }

    public Boolean isGiftProduct() {
        return this.isGiftProduct;
    }

    public boolean isPickFromStoreAvailable() {
        return this.pickFromStoreAvailable;
    }

    public boolean isProductNS() {
        return this.isProductNS;
    }

    public boolean isProductNSForGA() {
        return this.isProductNSForGA;
    }

    public boolean isProductTag() {
        return this.productTag;
    }

    public boolean isQuantityAvailable() {
        return this.isQuantityAvailable;
    }

    public boolean isReturnClicked() {
        return this.isReturnClicked;
    }

    public boolean isReturnEligible() {
        return this.isReturnEligible;
    }

    public boolean isReturnEligibleAtprodLevel() {
        return this.isReturnEligibleAtprodLevel;
    }

    public boolean isReturnItem() {
        return this.isReturnItem;
    }

    public boolean isReturnable() {
        return this.isReturnable;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public boolean isServicability() {
        return this.servicability;
    }

    public boolean isStockUpdate() {
        return this.isStockUpdate;
    }

    public boolean isTagAvailable() {
        return this.isTagAvailable;
    }

    public boolean isUpdateable() {
        return this.updateable;
    }

    public void reset() {
        String string2;
        this.exchangeEditedQuantity = 0;
        this.returnEditedQuantity = 0;
        this.cancelComments = string2 = "";
        this.reason = string2;
        this.subReason = string2;
        this.reasonIndex = -1;
        this.product.setSelectedProductSizeCode(null);
        this.imageInfoList = null;
        this.barCode = null;
        this.isTagAvailable = false;
        this.product.reset();
    }

    public void setActualDealStartTime(long l2) {
        this.actualDealStartTime = l2;
    }

    public void setAge(String string2) {
        this.age = string2;
    }

    public void setAggregateRating(String string2) {
        this.aggregateRating = string2;
    }

    public void setAjioFaultReturnFee(boolean bl2) {
        this.isAjioFaultReturnFee = bl2;
    }

    public void setAllPromotionsList(ArrayList arrayList) {
        this.allPromotionsList = arrayList;
        if (arrayList != null) {
            Collections.sort(arrayList);
        }
    }

    public void setAverageRating(Float f5) {
        this.averageRating = f5;
    }

    public void setBankDiscountPromoAmt(Double d2) {
        this.bankDiscountPromoAmt = d2;
    }

    public void setBarCode(String string2) {
        this.barCode = string2;
    }

    public void setBasePrice(Price price) {
        this.basePrice = price;
    }

    public void setBundleDiscountAmount(double d2) {
        this.bundleDiscountAmount = d2;
    }

    public void setBundleOfferApplicable(boolean bl2) {
        this.isBundleOfferApplicable = bl2;
    }

    public void setCancelComments(String string2) {
        this.cancelComments = string2;
    }

    public void setCancelReqTimestamp(String string2) {
        this.cancelReqTimestamp = string2;
    }

    public void setCanceledTimestamp(String string2) {
        this.canceledTimestamp = string2;
    }

    public void setCancellable(Boolean bl2) {
        this.isCancellable = bl2;
    }

    public void setCartAppliedPromotionInfoList(Set set) {
        this.cartAppliedPromotionInfoList = set;
    }

    public void setCartId(long l2) {
        this.cartId = l2;
    }

    public void setCartPotentialPromotionInfoList(Set set) {
        this.cartPotentialPromotionInfoList = set;
    }

    public void setCartPromotionInfoList(List list) {
        this.cartPromotionInfoList = list;
    }

    public void setCode(String string2) {
        this.code = string2;
    }

    public void setCommentsHint(String string2) {
        this.commentsHint = string2;
    }

    public void setConsignmentCode(String string2) {
        this.consignmentCode = string2;
    }

    public void setConvenienceFee(ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp) {
        this.convenienceFee = convenienceFeePriceSplitUp;
    }

    public void setConvenienceFeeEnabled(boolean bl2) {
        this.isConvenienceFeeEnabled = bl2;
    }

    public void setCtaMessage(String string2) {
        this.ctaMessage = string2;
    }

    public void setDealEnabled(boolean bl2) {
        this.dealEnabled = bl2;
    }

    public void setDealEndTime(long l2) {
        this.dealEndTime = l2;
    }

    public void setDealType(String string2) {
        this.dealType = string2;
    }

    public void setDeliverySLA(String string2) {
        this.deliverySLA = string2;
    }

    public void setDeliveryTagName(Object object) {
        this.deliveryTagName = object;
    }

    public void setDropAtStore(DropAtStore dropAtStore) {
        this.dropAtStore = dropAtStore;
    }

    public void setDropAtStoreAvailable(boolean bl2) {
        this.dropAtStoreAvailable = bl2;
    }

    public void setEddDate(String string2) {
        this.eddDate = string2;
    }

    public void setEddFormattedDate(String string2) {
        this.eddFormattedDate = string2;
    }

    public void setEddUpper(String string2) {
        this.eddUpper = string2;
    }

    public void setEntryNumber(Integer n3) {
        this.entryNumber = n3;
    }

    public void setEntryStatus(String string2) {
        this.entryStatus = string2;
    }

    public void setEntryStatusDisplay(String string2) {
        this.entryStatusDisplay = string2;
    }

    public void setEntryStatusMessage(String string2) {
        this.entryStatusMessage = string2;
    }

    public void setExchangeEditedQuantity(int n3) {
        this.exchangeEditedQuantity = n3;
    }

    public void setExchangeEligible(boolean bl2) {
        this.isExchangeEligible = bl2;
    }

    public void setExchangeEligibleAtProdLevel(boolean bl2) {
        this.isExchangeEligibleAtProdLevel = bl2;
    }

    public void setExchangeId(String string2) {
        this.exchangeId = string2;
    }

    public void setExchangeItem(boolean bl2) {
        this.isExchangeItem = bl2;
    }

    public void setExchangeable(boolean bl2) {
        this.isExchangeable = bl2;
    }

    public void setExperimentId(String string2) {
        this.experimentId = string2;
    }

    public void setGiftProduct(Boolean bl2) {
        this.isGiftProduct = bl2;
    }

    public void setGiftProducts(Object object) {
        this.giftProducts = object;
    }

    public void setGiftProductsCount(Integer n3) {
        this.giftProductsCount = n3;
    }

    public void setGiftQuantity(Integer n3) {
        this.giftQuantity = n3;
    }

    public void setImageInfoList(ArrayList arrayList) {
        this.imageInfoList = arrayList;
    }

    public void setInventoryQty(Integer n3) {
        this.inventoryQty = n3;
    }

    public void setIsExchangeItem(boolean bl2) {
        this.isExchangeItem = bl2;
    }

    public void setIsReturnItem(boolean bl2) {
        this.isReturnItem = bl2;
    }

    public void setLuxeTotalPrice(TotalPrice totalPrice) {
        this.luxeTotalPrice = totalPrice;
    }

    public void setMultiItemPromoAmt(String string2) {
        this.multiItemPromoAmt = string2;
    }

    public void setNetPrice(NetPrice netPrice) {
        this.netPrice = netPrice;
    }

    public void setNewEntryStatus(String string2) {
        this.newEntryStatus = string2;
    }

    public void setNewEntryStatusDisplay(String string2) {
        this.newEntryStatusDisplay = string2;
    }

    public void setNewEntryStatusMessage(String string2) {
        this.newEntryStatusMessage = string2;
    }

    public void setNumUserRatings(String string2) {
        this.numUserRatings = string2;
    }

    public void setOrderBucket(String string2) {
        this.orderBucket = string2;
    }

    public void setOrderCreatedDate(String string2) {
        this.orderCreatedDate = string2;
    }

    public void setOrderDetailData(int n3, int n4, int n7) {
        this.shipmentPosition = n3;
        this.listPosition = n4;
        this.consignmentCount = n7;
    }

    public void setOrderEntry(CartEntry cartEntry) {
        this.orderEntry = cartEntry;
    }

    public void setOrderId(String string2) {
        this.orderId = string2;
    }

    public void setOrderTotalQuantity(Integer n3) {
        this.orderTotalQuantity = n3;
    }

    public void setPickFromStoreAvailable(boolean bl2) {
        this.pickFromStoreAvailable = bl2;
    }

    public void setPremiumDealStartTime(long l2) {
        this.premiumDealStartTime = l2;
    }

    public void setPriceDrop(int n3) {
        this.priceDrop = n3;
    }

    public void setPriceIncrease(int n3) {
        this.priceIncrease = n3;
    }

    public void setPriorityDeliveryApplied(Boolean bl2) {
        this.isPriorityDeliveryApplied = bl2;
    }

    public void setPriorityDeliveryDate(String string2) {
        this.priorityDeliveryDate = string2;
    }

    public void setPriorityDeliveryFeeStatus(String string2) {
        this.priorityDeliveryFeeStatus = string2;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setProductCode(String string2) {
        this.productCode = string2;
    }

    public void setProductId(Long l2) {
        this.productId = l2;
    }

    public void setProductNS(boolean bl2) {
        this.isProductNS = bl2;
    }

    public void setProductNSForGA(boolean bl2) {
        this.isProductNSForGA = bl2;
    }

    public void setProductSimilarList(List list) {
        this.productSimilarList = list;
    }

    public void setProductTag(boolean bl2) {
        this.productTag = bl2;
    }

    public void setQuantity(Integer n3) {
        this.quantity = n3;
    }

    public void setQuantityAvailable(boolean bl2) {
        this.isQuantityAvailable = bl2;
    }

    public void setQuantityIndex(int n3) {
        this.quantityIndex = n3;
    }

    public void setQuantityToBeUpdated(int n3) {
        this.quantityToBeUpdated = n3;
    }

    public void setReason(String string2) {
        this.reason = string2;
    }

    public void setReasonForNotServiceability(String string2) {
        this.reasonForNotServiceability = string2;
    }

    public void setReasonIndex(int n3) {
        this.reasonIndex = n3;
    }

    public void setRefundFee(String string2) {
        this.returnFee = string2;
    }

    public void setRefundOptions(ArrayList arrayList) {
        this.refundOptions = arrayList;
    }

    public void setReturnClicked(boolean bl2) {
        this.isReturnClicked = bl2;
    }

    public void setReturnEditedQuantity(int n3) {
        this.returnEditedQuantity = n3;
    }

    public void setReturnEligible(boolean bl2) {
        this.isReturnEligible = bl2;
    }

    public void setReturnEligibleAtprodLevel(boolean bl2) {
        this.isReturnEligibleAtprodLevel = bl2;
    }

    public void setReturnExchangeCtaMessageList(ReturnExchangeCtaMessageList returnExchangeCtaMessageList) {
        this.returnExchangeCtaMessageList = returnExchangeCtaMessageList;
    }

    public void setReturnExchangeErrorMessage(String string2) {
        this.returnExchangeErrorMessage = string2;
    }

    public void setReturnId(String string2) {
        this.returnId = string2;
    }

    public void setReturnItem(boolean bl2) {
        this.isReturnItem = bl2;
    }

    public void setReturnOrderEntry(CartEntry cartEntry) {
        this.returnOrderEntry = cartEntry;
    }

    public void setReturnable(boolean bl2) {
        this.isReturnable = bl2;
    }

    public void setReturnedQty(int n3) {
        this.returnedQty = n3;
    }

    public void setSegmentId(String string2) {
        this.segmentId = string2;
    }

    public void setSelected(boolean bl2) {
        this.isSelected = bl2;
    }

    public void setServicability(boolean bl2) {
        this.servicability = bl2;
    }

    public void setServicabilityInfo(ServicabilityInfo servicabilityInfo) {
        this.servicabilityInfo = servicabilityInfo;
    }

    public void setShipmentCode(String string2) {
        this.shipmentCode = string2;
    }

    public void setShippingChargePromoAmt(Double d2) {
        this.shippingChargePromoAmt = d2;
    }

    public void setSourceStoreId(String string2) {
        this.sourceStoreId = string2;
    }

    public void setStatus(int n3) {
        this.status = n3;
    }

    public void setStockUpdate(boolean bl2) {
        this.isStockUpdate = bl2;
    }

    public void setSubReason(String string2) {
        this.subReason = string2;
    }

    public void setSubreasonIndex(String string2) {
        this.subreasonIndex = string2;
    }

    public void setTagAvailable(boolean bl2) {
        this.isTagAvailable = bl2;
    }

    public void setTags(ArrayList arrayList) {
        this.tags = arrayList;
    }

    public void setTotalBasePrice(NetPrice netPrice) {
        this.totalBasePrice = netPrice;
    }

    public void setTotalDiscountAmount(NetPrice netPrice) {
        this.totalDiscountAmount = netPrice;
    }

    public void setTotalDiscountPercentage(Float f5) {
        this.totalDiscountPercentage = f5;
    }

    public void setTotalEntryCount(int n3) {
        this.totalEntryCount = n3;
    }

    public void setTotalListPrice(NetPrice netPrice) {
        this.totalListPrice = netPrice;
    }

    public void setTotalPrice(Price price) {
        this.totalPrice = price;
    }

    public void setTotalPromoAmount(NetPrice netPrice) {
        this.totalPromoAmount = netPrice;
    }

    public void setTotalSavingAmount(NetPrice netPrice) {
        this.totalSavingAmount = netPrice;
    }

    public void setTotalVoucherAmount(NetPrice netPrice) {
        this.totalVoucherAmount = netPrice;
    }

    public void setUpdateable(boolean bl2) {
        this.updateable = bl2;
    }

    public void setVoucherMessages(String string2) {
        this.voucherMessages = string2;
    }

    public void setVoucherPromoAmt(String string2) {
        this.voucherPromoAmt = string2;
    }

    public void setWrongItemComments(String string2) {
        this.wrongItemComments = string2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CartEntry{servicability=");
        int n3 = this.servicability;
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", priceDrop=");
        n3 = this.priceDrop;
        stringBuilder.append(n3);
        stringBuilder.append(", basePrice=");
        Object object = this.basePrice;
        stringBuilder.append(object);
        stringBuilder.append(", entryNumber=");
        object = this.entryNumber;
        stringBuilder.append(object);
        stringBuilder.append(", product=");
        object = this.product;
        stringBuilder.append(object);
        stringBuilder.append(", quantity=");
        object = this.quantity;
        stringBuilder.append(object);
        stringBuilder.append(", exchangeEditedQuantity=");
        n3 = this.exchangeEditedQuantity;
        stringBuilder.append(n3);
        stringBuilder.append(", returnEditedQuantity=");
        n3 = this.returnEditedQuantity;
        stringBuilder.append(n3);
        stringBuilder.append(", totalPrice=");
        object = this.totalPrice;
        stringBuilder.append(object);
        stringBuilder.append(", updateable=");
        n3 = (int)(this.updateable ? 1 : 0);
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", entryStatus='");
        object = this.entryStatus;
        stringBuilder.append((String)object);
        stringBuilder.append("', entryStatusDisplay='");
        object = this.entryStatusDisplay;
        stringBuilder.append((String)object);
        stringBuilder.append("', entryStatusMessage='");
        object = this.entryStatusMessage;
        stringBuilder.append((String)object);
        stringBuilder.append("', cartId=");
        long l2 = this.cartId;
        stringBuilder.append(l2);
        stringBuilder.append(", orderId='");
        object = this.orderId;
        stringBuilder.append((String)object);
        stringBuilder.append("', totalEntryCount=");
        n3 = this.totalEntryCount;
        stringBuilder.append(n3);
        stringBuilder.append(", productId=");
        object = this.productId;
        stringBuilder.append(object);
        stringBuilder.append(", orderEntry=");
        object = this.orderEntry;
        stringBuilder.append(object);
        stringBuilder.append(", cartPromotionInfoList=");
        object = this.cartPromotionInfoList;
        stringBuilder.append(object);
        stringBuilder.append(", isSelected=");
        n3 = (int)(this.isSelected ? 1 : 0);
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", code='");
        object = this.code;
        stringBuilder.append((String)object);
        stringBuilder.append("', reason='");
        object = this.reason;
        stringBuilder.append((String)object);
        stringBuilder.append("', subReason='");
        object = this.subReason;
        stringBuilder.append((String)object);
        stringBuilder.append("', cancelComments='");
        object = this.cancelComments;
        stringBuilder.append((String)object);
        stringBuilder.append("', returnedQty=");
        n3 = this.returnedQty;
        stringBuilder.append(n3);
        stringBuilder.append(", productCode='");
        object = this.productCode;
        stringBuilder.append((String)object);
        stringBuilder.append("', returnOrderEntry=");
        object = this.returnOrderEntry;
        stringBuilder.append(object);
        stringBuilder.append(", reasonIndex=");
        n3 = this.reasonIndex;
        stringBuilder.append(n3);
        stringBuilder.append(", subreasonIndex='");
        object = this.subreasonIndex;
        stringBuilder.append((String)object);
        stringBuilder.append("', quantityIndex=");
        n3 = this.quantityIndex;
        stringBuilder.append(n3);
        stringBuilder.append(", commentsHint='");
        object = this.commentsHint;
        stringBuilder.append((String)object);
        stringBuilder.append("', isExchangeItem=");
        n3 = (int)(this.isExchangeItem ? 1 : 0);
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", isReturnItem=");
        n3 = this.isReturnItem;
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", isExchangeEligible=");
        n3 = this.isExchangeEligible;
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", isReturnEligible=");
        n3 = this.isReturnEligible;
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", dropAtStoreAvailable=");
        n3 = this.dropAtStoreAvailable;
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", pickFromStoreAvailable=");
        n3 = this.pickFromStoreAvailable;
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", eddDate='");
        object = this.eddDate;
        stringBuilder.append((String)object);
        stringBuilder.append("', isExchangeEligibleAtProdLevel=");
        n3 = this.isExchangeEligibleAtProdLevel;
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", isReturnEligibleAtprodLevel=");
        n3 = this.isReturnEligibleAtprodLevel;
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", returnExchangeErrorMessage='");
        object = this.returnExchangeErrorMessage;
        stringBuilder.append((String)object);
        stringBuilder.append("', bundleDiscountAmount=");
        double d2 = this.bundleDiscountAmount;
        stringBuilder.append(d2);
        stringBuilder.append(", isBundleOfferApplicable=");
        n3 = this.isBundleOfferApplicable;
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", voucherPromoAmt='");
        object = this.voucherPromoAmt;
        stringBuilder.append((String)object);
        stringBuilder.append("', multiItemPromoAmt='");
        object = this.multiItemPromoAmt;
        stringBuilder.append((String)object);
        stringBuilder.append("', amount='");
        object = this.amount;
        stringBuilder.append((String)object);
        stringBuilder.append("', quantityToBeUpdated=");
        n3 = this.quantityToBeUpdated;
        stringBuilder.append(n3);
        stringBuilder.append(", orderCreatedDate='");
        object = this.orderCreatedDate;
        stringBuilder.append((String)object);
        stringBuilder.append("', cartAppliedPromotionInfoList=");
        object = this.cartAppliedPromotionInfoList;
        stringBuilder.append(object);
        stringBuilder.append(", cartPotentialPromotionInfoList=");
        object = this.cartPotentialPromotionInfoList;
        stringBuilder.append(object);
        stringBuilder.append(", allPromotionsList=");
        object = this.allPromotionsList;
        stringBuilder.append(object);
        stringBuilder.append(", voucherMessages='");
        object = this.voucherMessages;
        stringBuilder.append((String)object);
        stringBuilder.append("', status=");
        n3 = this.status;
        stringBuilder.append(n3);
        stringBuilder.append(", dropAtStore=");
        object = this.dropAtStore;
        stringBuilder.append(object);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

