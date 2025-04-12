/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.services.data.Product;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.ril.ajio.services.data.Cart.NetPrice;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.AdsData;
import com.ril.ajio.services.data.Product.ComprehensiveProductDetails;
import com.ril.ajio.services.data.Product.HomeWidgetTypes;
import com.ril.ajio.services.data.Product.OfferPrice;
import com.ril.ajio.services.data.Product.PrepaidOffers;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.ProductSizeData;
import com.ril.ajio.services.data.Product.ProductSizeGuideData;
import com.ril.ajio.services.data.Product.ProductVideos;
import com.ril.ajio.services.data.Product.ProductfnlProductData;
import com.ril.ajio.services.data.Product.SectionData;
import com.ril.ajio.services.data.Product.SpotLight;
import com.ril.ajio.services.data.Product.StockInfo;
import com.ril.ajio.services.data.Product.Tag;
import com.ril.ajio.services.data.Product.TagResponse;
import com.ril.ajio.services.data.Product.fleek.BrandResponse;
import com.ril.ajio.services.data.Product.fleek.PostsResponse;
import com.ril.ajio.services.data.flashsale.pdp.RilfnlBreadCrumbList;
import com.ril.ajio.services.data.freebies.GiftPromotion;
import com.ril.ajio.services.data.ratings.RatingsResponse;
import com.ril.ajio.services.helper.UrlHelper;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class Product
implements Serializable {
    private AdsData adsData;
    private String aggregateRating;
    private int availableQuantity;
    private Double averageRating;
    private List baseOptions;
    private String baseProduct;
    private String brandCode;
    private String brandName;
    private BrandResponse brandResponse;
    private String brickCategory;
    private String brickCode;
    private String brickName;
    private String brickNameText;
    private String brickSubCategory;
    private String catalog;
    private String catalogName;
    private String ccbValue;
    private String code;
    private ComprehensiveProductDetails comprehensiveProductDetails;
    private String discountPercent;
    private long dodEndTime;
    private Price dodPriceData;
    private ArrayList errors;
    private String exclusiveTill;
    private String experimentId;
    private List extraImages;
    private List featureData;
    private ProductFnlColorVariantData fnlColorVariantData;
    private ProductfnlProductData fnlProductData;
    private Float futureBestPrice;
    private String futureDiscountPercent;
    private List galleryProductImageUrls;
    private final GiftPromotion giftPromotion;
    private Integer gwpQuantity;
    private String id;
    private List images;
    private Boolean inStockFlag;
    private boolean isAddedToCart;
    private boolean isBundleOfferAvailable;
    private boolean isComingSoonProduct;
    private boolean isDODEnabled;
    private final Boolean isExchangeable;
    private boolean isGaFiredInCurrentSession;
    private final boolean isGiftWithPurchase;
    private final boolean isReturnable;
    private String lastSavedCohort;
    private ProductSizeGuideData mProductSizeGuideData;
    private ArrayList mandatoryInfo;
    private String name;
    private NetPrice netPrice;
    private String numUserRatings;
    private OfferPrice offerPrice;
    private String originalSize;
    private int position;
    private PostsResponse postsResponse;
    private List potentialPromotions;
    private final PrepaidOffers prepaidOffers;
    private Price price;
    private String productListType;
    private List productOptionItems;
    private List productOptionVariants;
    private ProductSizeData productSizeData;
    private String productTD;
    private HomeWidgetTypes productType;
    private ProductVideos productVideos;
    private Integer quantity;
    private String ratingCount;
    private RatingsResponse ratingsResponse;
    private String responseStatus;
    private final String returnContent;
    private final String returnTitle;
    private final String returnUrl;
    private final Integer returnWindow;
    private RilfnlBreadCrumbList rilfnlBreadCrumbList;
    private Long saleEndTime;
    private Long saleStartTime;
    private String seasonCode;
    private SectionData sectionOne;
    private SectionData sectionThree;
    private SectionData sectionTwo;
    private String segmentId;
    private String segmentName;
    private String segmentNameText;
    private String selectedProductSizeCode;
    private String selectedSize;
    private ProductOptionVariant selectedSizeVariant;
    private ArrayList serviceErrors;
    private Boolean shouldDisplayPricingError;
    private boolean shouldShowSize;
    private boolean showSizeLayout;
    private String sourceStoreId;
    private final SpotLight spotlight;
    private StockInfo stockInfo;
    private boolean storeType;
    private String styleType;
    private TagResponse tagResponse;
    private Tag tags;
    private String url;
    private String userGroup;
    private List variantOptions;
    private String variantType;
    private String verticalColor;
    private String verticalName;
    private String verticalNameText;
    private int viewHolderPos;
    private Integer viewTypeWishlist;
    private Price wasPriceData;
    private long wishListCreatedDate;

    public Product() {
        HomeWidgetTypes homeWidgetTypes;
        int n3;
        Serializable serializable;
        String string2;
        this.responseStatus = string2 = "";
        this.wishListCreatedDate = -1;
        this.productOptionVariants = serializable = new Serializable();
        this.productOptionItems = serializable = new Serializable();
        this.shouldShowSize = true;
        serializable = Boolean.FALSE;
        this.shouldDisplayPricingError = serializable;
        this.viewHolderPos = n3 = -1;
        this.productType = homeWidgetTypes = HomeWidgetTypes.HOME_WIDGET_TYPE_PRODUCT;
        this.availableQuantity = n3;
        this.lastSavedCohort = string2;
    }

    public Product(String string2) {
        HomeWidgetTypes homeWidgetTypes;
        int n3;
        Serializable serializable;
        String string3;
        this.responseStatus = string3 = "";
        this.wishListCreatedDate = -1;
        this.productOptionVariants = serializable = new Serializable();
        this.productOptionItems = serializable = new Serializable();
        this.shouldShowSize = true;
        serializable = Boolean.FALSE;
        this.shouldDisplayPricingError = serializable;
        this.viewHolderPos = n3 = -1;
        this.productType = homeWidgetTypes = HomeWidgetTypes.HOME_WIDGET_TYPE_PRODUCT;
        this.availableQuantity = n3;
        this.lastSavedCohort = string3;
        this.id = string2;
    }

    private static final int _get_productGalleryImageUrls_$lambda$0(ProductImage productImage, ProductImage productImage2) {
        int n3 = productImage.getGalleryIndex();
        int n4 = productImage2.getGalleryIndex();
        return Intrinsics.compare(n3, n4);
    }

    private static final int _get_productGalleryImageUrls_$lambda$1(Function2 function2, Object object, Object object2) {
        Intrinsics.checkNotNullParameter(function2, "$tmp0");
        return ((Number)function2.invoke(object, object2)).intValue();
    }

    public static /* synthetic */ int a(qz2_2 qz2_22, Object object, Object object2) {
        return Product._get_productGalleryImageUrls_$lambda$1(qz2_22, object, object2);
    }

    public static /* synthetic */ int b(ProductImage productImage, ProductImage productImage2) {
        return Product._get_productGalleryImageUrls_$lambda$0(productImage, productImage2);
    }

    private final void overrideProductGuideSizeData() {
        Object object;
        ProductSizeGuideData productSizeGuideData = this.mProductSizeGuideData;
        if (productSizeGuideData != null) {
            object = this.baseProduct;
            productSizeGuideData.setProductCode((String)object);
        }
        if ((productSizeGuideData = this.mProductSizeGuideData) != null) {
            object = this.fnlProductData;
            object = object != null ? ((ProductfnlProductData)object).getPlanningCategory() : null;
            productSizeGuideData.setPlanningCategory((String)object);
        }
        if ((productSizeGuideData = this.mProductSizeGuideData) != null) {
            object = this.seasonCode;
            productSizeGuideData.setSeasonCode((String)object);
        }
        if ((productSizeGuideData = this.mProductSizeGuideData) != null) {
            object = this.brickCategory;
            productSizeGuideData.setGender((String)object);
        }
    }

    private final void setVariantQualifierOptionValues(ProductOptionItem productOptionItem) {
        boolean bl2;
        boolean bl3;
        Object object = productOptionItem.getVariantOptionQualifiers();
        if (object != null && ((object = productOptionItem.getVariantOptionQualifiers()) == null || (bl3 = object.isEmpty()) != (bl2 = true))) {
            Object object2;
            boolean bl4;
            object = productOptionItem.getVariantOptionQualifiers();
            bl2 = false;
            String string2 = null;
            if (object != null) {
                bl4 = false;
                object2 = null;
                object = (ProductOptionVariant)object.get(0);
            } else {
                bl3 = false;
                object = null;
            }
            if (object != null) {
                object2 = ((ProductOptionVariant)object).getName();
            } else {
                bl4 = false;
                object2 = null;
            }
            productOptionItem.setName((String)object2);
            if (object != null) {
                object2 = ((ProductOptionVariant)object).getValue();
            } else {
                bl4 = false;
                object2 = null;
            }
            productOptionItem.setValue((String)object2);
            if (object != null) {
                object2 = ((ProductOptionVariant)object).getQualifier();
            } else {
                bl4 = false;
                object2 = null;
            }
            productOptionItem.setQualifier((String)object2);
            if (object != null) {
                object2 = ((ProductOptionVariant)object).getImage();
            } else {
                bl4 = false;
                object2 = null;
            }
            if (object2 != null) {
                object2 = ((ProductOptionVariant)object).getImage();
                if (object2 != null) {
                    object2 = ((ProductImage)object2).getFormat();
                } else {
                    bl4 = false;
                    object2 = null;
                }
                bl4 = TextUtils.isEmpty((CharSequence)object2);
                if (!bl4) {
                    object2 = ((ProductOptionVariant)object).getImage();
                    if (object2 != null) {
                        object2 = ((ProductImage)object2).getUrl();
                    } else {
                        bl4 = false;
                        object2 = null;
                    }
                    bl4 = TextUtils.isEmpty((CharSequence)object2);
                    if (!bl4) {
                        object2 = ((ProductOptionVariant)object).getImage();
                        if (object2 != null) {
                            object2 = ((ProductImage)object2).getUrl();
                        } else {
                            bl4 = false;
                            object2 = null;
                        }
                        productOptionItem.setImageUrl((String)object2);
                        object = ((ProductOptionVariant)object).getImage();
                        if (object != null) {
                            string2 = ((ProductImage)object).getFormat();
                        }
                        productOptionItem.setImageFormat(string2);
                    }
                }
            }
        }
    }

    public final Product clone() {
        Object object = new Gson();
        Class<Product> clazz = Product.class;
        object = ((Gson)object).toJson((Object)this, (Type)((Object)clazz));
        Gson gson = new Gson();
        object = gson.fromJson((String)object, clazz);
        Intrinsics.checkNotNullExpressionValue(object, "fromJson(...)");
        return (Product)object;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof Product;
        boolean bl3 = true;
        if (!bl2) {
            return bl3;
        }
        object = ((Product)object).code;
        String string2 = this.code;
        return b.i((String)object, string2, bl3);
    }

    public final AdsData getAdsData() {
        return this.adsData;
    }

    public final String getAggregateRating() {
        return this.aggregateRating;
    }

    public final int getAvailableQuantity() {
        return this.availableQuantity;
    }

    public final Double getAverageRating() {
        return this.averageRating;
    }

    public final List getBaseOptions() {
        return this.baseOptions;
    }

    public final String getBaseProduct() {
        return this.baseProduct;
    }

    public final String getBrandCode() {
        return this.brandCode;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final BrandResponse getBrandResponse() {
        return this.brandResponse;
    }

    public final String getBrickCategory() {
        return this.brickCategory;
    }

    public final String getBrickCode() {
        return this.brickCode;
    }

    public final String getBrickName() {
        return this.brickName;
    }

    public final String getBrickNameText() {
        return this.brickNameText;
    }

    public final String getBrickSubCategory() {
        return this.brickSubCategory;
    }

    public final String getCatalog() {
        return this.catalog;
    }

    public final String getCatalogName() {
        return this.catalogName;
    }

    public final String getCcbValue() {
        return this.ccbValue;
    }

    public final String getCode() {
        return this.code;
    }

    public final ComprehensiveProductDetails getComprehensiveProductDetails() {
        return this.comprehensiveProductDetails;
    }

    public final String getDiscountPercent() {
        return this.discountPercent;
    }

    public final long getDodEndTime() {
        return this.dodEndTime;
    }

    public final Price getDodPriceData() {
        return this.dodPriceData;
    }

    public final ArrayList getErrors() {
        return this.errors;
    }

    public final String getExclusiveTill() {
        return this.exclusiveTill;
    }

    public final String getExperimentId() {
        return this.experimentId;
    }

    public final List getExtraImages() {
        return this.extraImages;
    }

    public final List getFeatureData() {
        return this.featureData;
    }

    public final ProductFnlColorVariantData getFnlColorVariantData() {
        return this.fnlColorVariantData;
    }

    public final ProductfnlProductData getFnlProductData() {
        return this.fnlProductData;
    }

    public final Float getFutureBestPrice() {
        return this.futureBestPrice;
    }

    public final String getFutureDiscountPercent() {
        return this.futureDiscountPercent;
    }

    public final GiftPromotion getGiftPromotion() {
        return this.giftPromotion;
    }

    public final Integer getGwpQuantity() {
        return this.gwpQuantity;
    }

    public final String getId() {
        return this.id;
    }

    public final List getImages() {
        return this.images;
    }

    public final Boolean getInStockFlag() {
        return this.inStockFlag;
    }

    public final String getLastSavedCohort() {
        return this.lastSavedCohort;
    }

    public final ArrayList getMandatoryInfo() {
        return this.mandatoryInfo;
    }

    public final String getName() {
        return this.name;
    }

    public final NetPrice getNetPrice() {
        return this.netPrice;
    }

    public final String getNewSizeGuideURL() {
        Object object = this.mProductSizeGuideData;
        String string2 = null;
        if (object == null && (object = (object = this.fnlColorVariantData) != null ? ((ProductFnlColorVariantData)object).getSizeGuideDesktop() : null) != null) {
            object = new Gson();
            Object object2 = this.fnlColorVariantData;
            object2 = object2 != null ? ((ProductFnlColorVariantData)object2).getSizeGuideDesktop() : null;
            Object[] objectArray = ProductSizeGuideData.class;
            this.mProductSizeGuideData = object = (ProductSizeGuideData)((Gson)object).fromJson((String)object2, (Class)objectArray);
            if (object != null) {
                this.overrideProductGuideSizeData();
                object = this.mProductSizeGuideData;
                if (object != null) {
                    string2 = ((ProductSizeGuideData)object).getSizeGuideURL();
                }
            } else {
                object = yn3_0.a;
                object2 = this.fnlColorVariantData;
                object2 = object2 != null ? ((ProductFnlColorVariantData)object2).getSizeGuideDesktop() : null;
                int n3 = 1;
                objectArray = new Object[n3];
                objectArray[0] = object2;
                object2 = "getSizeGuideDesktop %s";
                ((yn3$a)object).a((String)object2, objectArray);
            }
        } else {
            object = this.mProductSizeGuideData;
            if (object != null) {
                string2 = ((ProductSizeGuideData)object).getSizeGuideURL();
            }
        }
        return string2;
    }

    public final String getNumUserRatings() {
        return this.numUserRatings;
    }

    public final OfferPrice getOfferPrice() {
        return this.offerPrice;
    }

    public final ProductImage getOrderConfirmImage() {
        Object object = this.images;
        ProductImage productImage = null;
        if (object != null) {
            boolean bl2;
            Object object2 = this.images;
            Intrinsics.checkNotNull(object2);
            object2 = (Collection)object2;
            object = new ArrayList(object2);
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                productImage = (ProductImage)object.next();
                object2 = productImage.getFormat();
                String string2 = "mobileProductListingImage";
                boolean bl3 = true;
                b.i((String)object2, string2, bl3);
            }
        }
        return productImage;
    }

    public final String getOriginalSize() {
        return this.originalSize;
    }

    public final int getPosition() {
        return this.position;
    }

    public final PostsResponse getPostsResponse() {
        return this.postsResponse;
    }

    public final List getPotentialPromotions() {
        return this.potentialPromotions;
    }

    public final PrepaidOffers getPrepaidOffers() {
        return this.prepaidOffers;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final List getProductGalleryImageUrls() {
        Object object = new ArrayList();
        this.galleryProductImageUrls = object;
        object = this.images;
        if (object != null) {
            boolean bl2;
            Object object2 = this.images;
            Intrinsics.checkNotNull(object2);
            object2 = (Collection)object2;
            object = new ArrayList(object2);
            object2 = new Object();
            Object object3 = new rz2_1((qz2_2)object2);
            Collections.sort(object, object3);
            object = ((ArrayList)object).iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                String string2;
                object2 = (ProductImage)object.next();
                object3 = ((ProductImage)object2).getFormat();
                boolean bl4 = b.i((String)object3, string2 = "product", bl3 = true);
                if (!bl4 || !(bl4 = b.i((String)(object3 = ((ProductImage)object2).getImageType()), string2 = "GALLERY", bl3))) continue;
                object3 = UrlHelper.Companion.getInstance();
                string2 = ((ProductImage)object2).getUrl();
                object3 = ((UrlHelper)object3).getImageUrl(string2);
                ((ProductImage)object2).setUrl((String)object3);
                object3 = this.galleryProductImageUrls;
                if (object3 == null) continue;
                object3.add(object2);
            }
        }
        return this.galleryProductImageUrls;
    }

    public final String getProductListType() {
        return this.productListType;
    }

    public final List getProductOptionItems() {
        return this.productOptionItems;
    }

    public final List getProductOptionVariants() {
        return this.productOptionVariants;
    }

    public final ProductSizeData getProductSizeData() {
        return this.productSizeData;
    }

    public final ProductSizeGuideData getProductSizeGuideData() {
        Object object = this.mProductSizeGuideData;
        if (object == null) {
            object = this.fnlColorVariantData;
            String string2 = null;
            if ((object = object != null ? ((ProductFnlColorVariantData)object).getSizeGuideDesktop() : null) != null) {
                Class<ProductSizeGuideData> clazz;
                int n3;
                object = new Gson();
                Object object2 = this.fnlColorVariantData;
                if (object2 != null) {
                    object2 = object2.getSizeGuideDesktop();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                n3 = TextUtils.isEmpty((CharSequence)object2);
                if (n3 == 0) {
                    object2 = this.fnlColorVariantData;
                    if (object2 != null) {
                        object2 = object2.getSizeGuideDesktop();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    clazz = ProductSizeGuideData.class;
                    this.mProductSizeGuideData = object = (ProductSizeGuideData)((Gson)object).fromJson((String)object2, clazz);
                }
                if ((object = this.mProductSizeGuideData) != null) {
                    this.overrideProductGuideSizeData();
                } else {
                    object = yn3_0.a;
                    object2 = this.fnlColorVariantData;
                    if (object2 != null) {
                        string2 = object2.getSizeGuideDesktop();
                    }
                    n3 = 1;
                    object2 = new Object[n3];
                    clazz = null;
                    object2[0] = string2;
                    string2 = "getSizeGuideDesktop %s";
                    ((yn3$a)object).a(string2, object2);
                }
            }
        }
        return this.mProductSizeGuideData;
    }

    public final String getProductTD() {
        return this.productTD;
    }

    public final HomeWidgetTypes getProductType() {
        return this.productType;
    }

    public final ProductVideos getProductVideos() {
        return this.productVideos;
    }

    public final List getProductZoomImages() {
        Object object = new ArrayList();
        this.galleryProductImageUrls = object;
        object = this.images;
        if (object != null) {
            boolean bl2;
            Object object2 = this.images;
            Intrinsics.checkNotNull(object2);
            object2 = (Collection)object2;
            object = new ArrayList(object2);
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                String string2;
                object2 = (ProductImage)object.next();
                Object object3 = ((ProductImage)object2).getFormat();
                boolean bl4 = b.i((String)object3, string2 = "superZoomPdp", bl3 = true);
                if (!bl4 || !(bl4 = b.i((String)(object3 = ((ProductImage)object2).getImageType()), string2 = "GALLERY", bl3))) continue;
                object3 = UrlHelper.Companion.getInstance();
                string2 = ((ProductImage)object2).getUrl();
                object3 = ((UrlHelper)object3).getImageUrl(string2);
                ((ProductImage)object2).setUrl((String)object3);
                object3 = this.galleryProductImageUrls;
                if (object3 == null) continue;
                object3.add(object2);
            }
        }
        return this.galleryProductImageUrls;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final String getRatingCount() {
        return this.ratingCount;
    }

    public final RatingsResponse getRatingsResponse() {
        return this.ratingsResponse;
    }

    public final String getResponseStatus() {
        return this.responseStatus;
    }

    public final String getReturnContent() {
        return this.returnContent;
    }

    public final String getReturnTitle() {
        return this.returnTitle;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final Integer getReturnWindow() {
        return this.returnWindow;
    }

    public final RilfnlBreadCrumbList getRilfnlBreadCrumbList() {
        return this.rilfnlBreadCrumbList;
    }

    public final Long getSaleEndTime() {
        return this.saleEndTime;
    }

    public final Long getSaleStartTime() {
        return this.saleStartTime;
    }

    public final String getSeasonCode() {
        return this.seasonCode;
    }

    public final SectionData getSectionOne() {
        return this.sectionOne;
    }

    public final SectionData getSectionThree() {
        return this.sectionThree;
    }

    public final SectionData getSectionTwo() {
        return this.sectionTwo;
    }

    public final String getSegmentId() {
        return this.segmentId;
    }

    public final String getSegmentName() {
        return this.segmentName;
    }

    public final String getSegmentNameText() {
        return this.segmentNameText;
    }

    public final String getSelectedProductSizeCode() {
        return this.selectedProductSizeCode;
    }

    public final String getSelectedSize() {
        return this.selectedSize;
    }

    public final ProductOptionVariant getSelectedSizeVariant() {
        return this.selectedSizeVariant;
    }

    public final ArrayList getServiceErrors() {
        return this.serviceErrors;
    }

    public final Boolean getShouldDisplayPricingError() {
        return this.shouldDisplayPricingError;
    }

    public final boolean getShouldShowSize() {
        return this.shouldShowSize;
    }

    public final boolean getShowSizeLayout() {
        return this.showSizeLayout;
    }

    public final String getSourceStoreId() {
        return this.sourceStoreId;
    }

    public final SpotLight getSpotlight() {
        return this.spotlight;
    }

    public final StockInfo getStockInfo() {
        return this.stockInfo;
    }

    public final boolean getStoreType() {
        return this.storeType;
    }

    public final String getStyleType() {
        return this.styleType;
    }

    public final TagResponse getTagResponse() {
        return this.tagResponse;
    }

    public final Tag getTags() {
        return this.tags;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUserGroup() {
        return this.userGroup;
    }

    public final List getVariantOptions() {
        return this.variantOptions;
    }

    public final String getVariantType() {
        return this.variantType;
    }

    public final String getVerticalColor() {
        return this.verticalColor;
    }

    public final String getVerticalName() {
        return this.verticalName;
    }

    public final String getVerticalNameText() {
        return this.verticalNameText;
    }

    public final int getViewHolderPos() {
        return this.viewHolderPos;
    }

    public final Integer getViewTypeWishlist() {
        return this.viewTypeWishlist;
    }

    public final Price getWasPriceData() {
        return this.wasPriceData;
    }

    public final long getWishListCreatedDate() {
        return this.wishListCreatedDate;
    }

    public int hashCode() {
        int n3;
        String string2 = this.code;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        return n3;
    }

    public final boolean isAddedToCart() {
        return this.isAddedToCart;
    }

    public final boolean isBundleOfferAvailable() {
        return this.isBundleOfferAvailable;
    }

    public final boolean isComingSoonProduct() {
        return this.isComingSoonProduct;
    }

    public final boolean isDODEnabled() {
        return this.isDODEnabled;
    }

    public final Boolean isExchangeable() {
        return this.isExchangeable;
    }

    public final boolean isGaFiredInCurrentSession() {
        return this.isGaFiredInCurrentSession;
    }

    public final boolean isGiftWithPurchase() {
        return this.isGiftWithPurchase;
    }

    public final boolean isReturnable() {
        return this.isReturnable;
    }

    public final void populate() {
        boolean bl2;
        Object object = this.baseOptions;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            object = (Collection)object;
            boolean bl3 = object.isEmpty();
            bl2 = true;
            if (bl3 ^= bl2) {
                boolean bl4;
                object = this.baseOptions;
                Intrinsics.checkNotNull(object);
                object = object.iterator();
                while (bl4 = object.hasNext()) {
                    boolean bl5;
                    Object object2 = (ProductOption)object.next();
                    Object object3 = ((ProductOption)object2).getSelected();
                    if (object3 != null) {
                        object3 = ((ProductOption)object2).getSelected();
                        Intrinsics.checkNotNull(object3);
                        ((ProductOptionItem)object3).setSelectedOption(bl2);
                        object3 = ((ProductOption)object2).getSelected();
                        Intrinsics.checkNotNull(object3);
                        this.setVariantQualifierOptionValues((ProductOptionItem)object3);
                    }
                    if ((object3 = ((ProductOption)object2).getOptions()) == null) continue;
                    object2 = ((ProductOption)object2).getOptions();
                    Intrinsics.checkNotNull(object2);
                    object2 = object2.iterator();
                    while (bl5 = object2.hasNext()) {
                        object3 = (ProductOptionItem)object2.next();
                        ((ProductOptionItem)object3).setSelectedOption(false);
                        this.setVariantQualifierOptionValues((ProductOptionItem)object3);
                    }
                }
            }
        }
        if ((object = this.variantOptions) != null) {
            Intrinsics.checkNotNull(object);
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                ProductOptionItem productOptionItem = (ProductOptionItem)object.next();
                productOptionItem.setSelectedOption(false);
                this.setVariantQualifierOptionValues(productOptionItem);
            }
        }
    }

    public final void reset() {
        Object object;
        boolean bl2;
        Object object2;
        boolean bl3;
        Object object3 = this.baseOptions;
        if (object3 != null) {
            object3 = object3.iterator();
            while (bl3 = object3.hasNext()) {
                object2 = ((ProductOption)object3.next()).getOptions();
                if (object2 == null) continue;
                object2 = object2.iterator();
                while (bl2 = object2.hasNext()) {
                    object = ((ProductOptionItem)object2.next()).getVariantOptionQualifiers();
                    if (object == null) continue;
                    Collection collection = object;
                    collection = (Collection)object;
                    int n3 = collection.size();
                    for (int i3 = 0; i3 < n3; ++i3) {
                        ProductOptionVariant productOptionVariant = (ProductOptionVariant)object.get(i3);
                        productOptionVariant.setSelected(false);
                    }
                }
            }
        }
        if ((object3 = this.variantOptions) != null) {
            Intrinsics.checkNotNull(object3);
            object3 = object3.iterator();
            while (bl3 = object3.hasNext()) {
                object2 = ((ProductOptionItem)object3.next()).getVariantOptionQualifiers();
                if (object2 == null) continue;
                object2 = object2.iterator();
                while (bl2 = object2.hasNext()) {
                    object = (ProductOptionVariant)object2.next();
                    ((ProductOptionVariant)object).setSelected(false);
                }
            }
        }
    }

    public final void setAddedToCart(boolean bl2) {
        this.isAddedToCart = bl2;
    }

    public final void setAdsData(AdsData adsData) {
        this.adsData = adsData;
    }

    public final void setAggregateRating(String string2) {
        this.aggregateRating = string2;
    }

    public final void setAvailableQuantity(int n3) {
        this.availableQuantity = n3;
    }

    public final void setAverageRating(Double d2) {
        this.averageRating = d2;
    }

    public final void setBaseOptions(List list) {
        this.baseOptions = list;
    }

    public final void setBaseProduct(String string2) {
        this.baseProduct = string2;
    }

    public final void setBrandCode(String string2) {
        this.brandCode = string2;
    }

    public final void setBrandName(String string2) {
        this.brandName = string2;
    }

    public final void setBrandResponse(BrandResponse brandResponse) {
        this.brandResponse = brandResponse;
    }

    public final void setBrickCategory(String string2) {
        this.brickCategory = string2;
    }

    public final void setBrickCode(String string2) {
        this.brickCode = string2;
    }

    public final void setBrickName(String string2) {
        this.brickName = string2;
    }

    public final void setBrickNameText(String string2) {
        this.brickNameText = string2;
    }

    public final void setBrickSubCategory(String string2) {
        this.brickSubCategory = string2;
    }

    public final void setBundleOfferAvailable(boolean bl2) {
        this.isBundleOfferAvailable = bl2;
    }

    public final void setCatalog(String string2) {
        this.catalog = string2;
    }

    public final void setCatalogName(String string2) {
        this.catalogName = string2;
    }

    public final void setCcbValue(String string2) {
        this.ccbValue = string2;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public final void setComingSoonProduct(boolean bl2) {
        this.isComingSoonProduct = bl2;
    }

    public final void setComprehensiveProductDetails(ComprehensiveProductDetails comprehensiveProductDetails) {
        this.comprehensiveProductDetails = comprehensiveProductDetails;
    }

    public final void setDODEnabled(boolean bl2) {
        this.isDODEnabled = bl2;
    }

    public final void setDiscountPercent(String string2) {
        this.discountPercent = string2;
    }

    public final void setDodEndTime(long l2) {
        this.dodEndTime = l2;
    }

    public final void setDodPriceData(Price price) {
        this.dodPriceData = price;
    }

    public final void setErrors(ArrayList arrayList) {
        this.errors = arrayList;
    }

    public final void setExclusiveTill(String string2) {
        this.exclusiveTill = string2;
    }

    public final void setExperimentId(String string2) {
        this.experimentId = string2;
    }

    public final void setExtraImages(List list) {
        this.extraImages = list;
    }

    public final void setFeatureData(List list) {
        this.featureData = list;
    }

    public final void setFnlColorVariantData(ProductFnlColorVariantData productFnlColorVariantData) {
        this.fnlColorVariantData = productFnlColorVariantData;
    }

    public final void setFnlProductData(ProductfnlProductData productfnlProductData) {
        this.fnlProductData = productfnlProductData;
    }

    public final void setFutureBestPrice(Float f5) {
        this.futureBestPrice = f5;
    }

    public final void setFutureDiscountPercent(String string2) {
        this.futureDiscountPercent = string2;
    }

    public final void setGaFiredInCurrentSession(boolean bl2) {
        this.isGaFiredInCurrentSession = bl2;
    }

    public final void setGwpQuantity(Integer n3) {
        this.gwpQuantity = n3;
    }

    public final void setId(String string2) {
        this.id = string2;
    }

    public final void setImages(List list) {
        this.images = list;
    }

    public final void setInStockFlag(Boolean bl2) {
        this.inStockFlag = bl2;
    }

    public final void setLastSavedCohort(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.lastSavedCohort = string2;
    }

    public final void setMandatoryInfo(ArrayList arrayList) {
        this.mandatoryInfo = arrayList;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setNetPrice(NetPrice netPrice) {
        this.netPrice = netPrice;
    }

    public final void setNumUserRatings(String string2) {
        this.numUserRatings = string2;
    }

    public final void setOfferPrice(OfferPrice offerPrice) {
        this.offerPrice = offerPrice;
    }

    public final void setOriginalSize(String string2) {
        this.originalSize = string2;
    }

    public final void setPosition(int n3) {
        this.position = n3;
    }

    public final void setPostsResponse(PostsResponse postsResponse) {
        this.postsResponse = postsResponse;
    }

    public final void setPotentialPromotions(List list) {
        this.potentialPromotions = list;
    }

    public final void setPrice(Price price) {
        this.price = price;
    }

    public final void setProductListType(String string2) {
        this.productListType = string2;
    }

    public final void setProductOptionItems(List list) {
        this.productOptionItems = list;
    }

    public final void setProductOptionVariants(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.productOptionVariants = list;
    }

    public final void setProductSizeData(ProductSizeData productSizeData) {
        this.productSizeData = productSizeData;
    }

    public final void setProductTD(String string2) {
        this.productTD = string2;
    }

    public final void setProductType(HomeWidgetTypes homeWidgetTypes) {
        this.productType = homeWidgetTypes;
    }

    public final void setProductVideos(ProductVideos productVideos) {
        this.productVideos = productVideos;
    }

    public final void setQuantity(Integer n3) {
        this.quantity = n3;
    }

    public final void setRatingCount(String string2) {
        this.ratingCount = string2;
    }

    public final void setRatingsResponse(RatingsResponse ratingsResponse) {
        this.ratingsResponse = ratingsResponse;
    }

    public final void setResponseStatus(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.responseStatus = string2;
    }

    public final void setRilfnlBreadCrumbList(RilfnlBreadCrumbList rilfnlBreadCrumbList) {
        this.rilfnlBreadCrumbList = rilfnlBreadCrumbList;
    }

    public final void setSaleEndTime(Long l2) {
        this.saleEndTime = l2;
    }

    public final void setSaleStartTime(Long l2) {
        this.saleStartTime = l2;
    }

    public final void setSeasonCode(String string2) {
        this.seasonCode = string2;
    }

    public final void setSectionOne(SectionData sectionData) {
        this.sectionOne = sectionData;
    }

    public final void setSectionThree(SectionData sectionData) {
        this.sectionThree = sectionData;
    }

    public final void setSectionTwo(SectionData sectionData) {
        this.sectionTwo = sectionData;
    }

    public final void setSegmentId(String string2) {
        this.segmentId = string2;
    }

    public final void setSegmentName(String string2) {
        this.segmentName = string2;
    }

    public final void setSegmentNameText(String string2) {
        this.segmentNameText = string2;
    }

    public final void setSelectedProductSizeCode(String string2) {
        this.selectedProductSizeCode = string2;
    }

    public final void setSelectedSize(String string2) {
        this.selectedSize = string2;
    }

    public final void setSelectedSizeVariant(ProductOptionVariant productOptionVariant) {
        this.selectedSizeVariant = productOptionVariant;
    }

    public final void setServiceErrors(ArrayList arrayList) {
        this.serviceErrors = arrayList;
    }

    public final void setShouldDisplayPricingError(Boolean bl2) {
        this.shouldDisplayPricingError = bl2;
    }

    public final void setShouldShowSize(boolean bl2) {
        this.shouldShowSize = bl2;
    }

    public final void setShowSizeLayout(boolean bl2) {
        this.showSizeLayout = bl2;
    }

    public final void setSourceStoreId(String string2) {
        this.sourceStoreId = string2;
    }

    public final void setStockInfo(StockInfo stockInfo) {
        this.stockInfo = stockInfo;
    }

    public final void setStoreType(boolean bl2) {
        this.storeType = bl2;
    }

    public final void setStyleType(String string2) {
        this.styleType = string2;
    }

    public final void setTagResponse(TagResponse tagResponse) {
        this.tagResponse = tagResponse;
    }

    public final void setTags(Tag tag) {
        this.tags = tag;
    }

    public final void setUrl(String string2) {
        this.url = string2;
    }

    public final void setUserGroup(String string2) {
        this.userGroup = string2;
    }

    public final void setVariantOptions(List list) {
        this.variantOptions = list;
    }

    public final void setVariantType(String string2) {
        this.variantType = string2;
    }

    public final void setVerticalColor(String string2) {
        this.verticalColor = string2;
    }

    public final void setVerticalName(String string2) {
        this.verticalName = string2;
    }

    public final void setVerticalNameText(String string2) {
        this.verticalNameText = string2;
    }

    public final void setViewHolderPos(int n3) {
        this.viewHolderPos = n3;
    }

    public final void setViewTypeWishlist(Integer n3) {
        this.viewTypeWishlist = n3;
    }

    public final void setWasPriceData(Price price) {
        this.wasPriceData = price;
    }

    public final void setWishListCreatedDate(long l2) {
        this.wishListCreatedDate = l2;
    }

    public String toString() {
        String string2 = this.name;
        if (string2 == null) {
            string2 = "";
        }
        return string2;
    }
}

