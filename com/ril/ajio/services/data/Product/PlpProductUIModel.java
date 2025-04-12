/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableString
 */
package com.ril.ajio.services.data.Product;

import android.text.SpannableString;
import com.ril.ajio.services.data.Product.HomeWidgetTypes;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PlpProductUIModel {
    private String accBannerDesc;
    private String addToBagContentDescription;
    private String addedToCartText;
    private Double averageRating;
    private String bargainUrgencyTagValue;
    private Float bestPriceValue;
    private String brandName;
    private boolean cardUi;
    private boolean cartClickListners;
    private boolean cartClosetClickListners;
    private boolean checkIfTalkbackServiceEnabled;
    private String closetAddBagContentDescription;
    private String closetAddBagText;
    private String closetAddedButtonContentDescription;
    private String closetButtonContentDescription;
    private boolean closetSelectionEnable;
    private String closetSimilarContentDescription;
    private String colorGroup;
    private String deleteWishlistContentDescription;
    private String deliverySlaTag;
    private String discountPercentValue;
    private String discountPriceContentDescription;
    private String discountPriceValue;
    private long dodEndTime;
    private boolean enableAddToBagCartClosetClick;
    private boolean enableAddedToBag;
    private boolean enableAddtoBag;
    private boolean enableAddtoCart;
    private boolean enableCartClosetAddToBag;
    private boolean enableCartClosetSelectSize;
    private boolean enableCartClosetSizeLayout;
    private boolean enableComingSoonProducts;
    private boolean enableDeleteOssContainer;
    private boolean enableFreebie;
    private boolean enableOOSBG;
    private boolean enableOOSTV;
    private boolean enableOutOfStock;
    private boolean enableRatingView;
    private boolean enableSaleContainer;
    private boolean enableSimilarCartClosetCLick;
    private boolean enableWishlistView;
    private boolean enablebackground;
    private boolean enabledeleteImg;
    private ArrayList extraImagesUrlList;
    private String finalPriceContentDescription;
    private String finalPriceValue;
    private ProductFnlColorVariantData fnlColorVariantData;
    private String gwpFreebiesOneText;
    private String headerText;
    private boolean isAfterCartLuxEnabled;
    private Boolean isAjiogramProduct;
    private boolean isAjiogramStoreId;
    private boolean isAllOutOfStock;
    private boolean isAllPromotions;
    private boolean isComingSoonEnable;
    private boolean isDodEnabled;
    private boolean isFromHomeProductWidget;
    private boolean isGWPFeatureEnabledAjioLuxe;
    private boolean isGiftAvailable;
    private boolean isGwpEnabled;
    private boolean isHeaderNotEmpty;
    private boolean isImageLoaded;
    private boolean isLuxeAfercartAndLuxeEnable;
    private boolean isLuxeCartPriceEnable;
    private boolean isLuxeEnabled;
    private boolean isPlpBargainUrgencyTagEnabled;
    private boolean isPlpUrgencyTagEnabled;
    private boolean isPositionSelected;
    private boolean isPreSalePlp;
    private boolean isPriceDropReqd;
    private boolean isPriceValueChanges;
    private boolean isPrioritydeliveryFeatureEnable;
    private boolean isProductWishlisted;
    private boolean isPromoImageAvailable;
    private boolean isRatingEnabledPlp;
    private boolean isRatingStarDisplayEnabled;
    private boolean isRecentlyViewLayoutChanges;
    private boolean isRecentlyWidgetEnable;
    private boolean isSaleContainerSpaceRetained;
    private boolean isSaleWishlist;
    private boolean isSelectionMode;
    private boolean isSimilarOOSWishListAjioANDOOSBagEnabled;
    private boolean isSimilarOOSWishListLuxeANDOOSBagEnabled;
    private boolean isSimilarOOSWishlistEnabled;
    private boolean isSimilarOOSWishlistLuxeEnabled;
    private boolean isSimilarProductEnabled;
    private boolean isWishlistCountAvailable;
    private boolean layoutWidthChangesRequired;
    private boolean luxeCartClickListners;
    private String mrpPriceContentDescription;
    private SpannableString mrpPriceValue;
    private boolean newProductViewClickListeners;
    private String offerPrice;
    private String offerPriceContentDescription;
    private String offerPriceValue;
    private String oosSimilarContentDescription;
    private boolean pdpInfoProviderLuxeEnable;
    private boolean populateSelectSizeLabel;
    private String priceDrop;
    private boolean priceDropValue;
    private Float priceValue;
    private boolean productClicklisteners;
    private String productCode;
    private String productColorCode;
    private String productImageContentDescription;
    private String productImageUrl;
    private String productImgPlaceholerDescription;
    private String productName;
    private List productOptionVariants;
    private String productRatingCount;
    private String productTagValue;
    private String productTagViewContentDescription;
    private boolean productTextWrap;
    private HomeWidgetTypes productType;
    private String promoContentDescription;
    private String promoImageurl;
    private boolean recentViewclickListners;
    private boolean recentlyViewedProdPrice;
    private boolean sellingFastTag;
    private boolean setDiscountColor;
    private boolean setOfferPrice;
    private boolean setOfferPriceDrawable;
    private boolean shouldShowProductDescription;
    private boolean showAdTag;
    private boolean showAddedToCart;
    private boolean showAjiogramTag;
    private boolean showDiscountPrice;
    private boolean showFinalPrice;
    private boolean showMrpPrice;
    private boolean showOODEnable;
    private boolean showOfferPrice;
    private boolean showPlpGrid;
    private boolean showProductTags;
    private boolean showSizeCount;
    private boolean showSizeFirstView;
    private boolean showSizeFourthView;
    private boolean showSizeLayout;
    private boolean showSizeSecondView;
    private boolean showSizeThirdView;
    private boolean showSizeVariants;
    private boolean showSizeView;
    private String similarIconContentDescription;
    private String similarProductType;
    private String sizeContentDescription;
    private String sizeCountText;
    private String sizeFirstViewText;
    private String sizeFourthViewText;
    private String sizeSecondViewText;
    private String sizeThirdViewText;
    private String urgencyTagValue;
    private List variantOptions;
    private int viewHolderPos;
    private Integer viewTypeWishlist;
    private Float wasPriceValue;
    private String wishlistCountLongText;
    private String wishlistCountShortText;

    public PlpProductUIModel() {
        this(null, null, null, null, null, null, 0, false, null, null, null, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, null, false, null, null, false, false, false, false, false, false, false, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, null, null, false, null, null, null, null, false, false, false, null, null, false, false, false, false, false, null, false, null, false, false, false, false, false, null, false, false, null, null, null, false, false, null, false, null, null, false, null, null, false, null, null, false, null, null, null, null, null, false, 0L, null, false, null, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, -1, -1, -1, -1, -1 >>> 4, null);
    }

    public PlpProductUIModel(String string2, String string3, String string4, String string5, Integer n3, HomeWidgetTypes homeWidgetTypes, int n4, boolean bl2, String string6, String string7, ArrayList arrayList, String string8, boolean bl3, String string9, String string10, boolean bl4, String string11, String string12, boolean bl5, String string13, String string14, String string15, boolean bl6, boolean bl7, String string16, String string17, boolean bl8, String string18, boolean bl9, String string19, Boolean bl10, boolean bl11, boolean bl12, boolean bl13, boolean bl14, boolean bl15, boolean bl16, boolean bl17, String string20, String string21, String string22, String string23, String string24, boolean bl18, String string25, boolean bl19, boolean bl20, boolean bl21, boolean bl22, boolean bl23, boolean bl24, boolean bl25, String string26, List list, List list2, boolean bl26, String string27, String string28, String string29, String string30, boolean bl27, boolean bl28, boolean bl29, String string31, String string32, boolean bl30, boolean bl31, boolean bl32, boolean bl33, boolean bl34, ProductFnlColorVariantData productFnlColorVariantData, boolean bl35, String string33, boolean bl36, boolean bl37, boolean bl38, boolean bl39, boolean bl40, String string34, boolean bl41, boolean bl42, String string35, String string36, String string37, boolean bl43, boolean bl44, String string38, boolean bl45, String string39, String string40, boolean bl46, SpannableString spannableString, String string41, boolean bl47, String string42, String string43, boolean bl48, Float f5, Float f6, Float f7, String string44, String string45, boolean bl49, long l2, String string46, boolean bl50, String string47, boolean bl51, boolean bl52, boolean bl53, boolean bl54, String string48, boolean bl55, boolean bl56, boolean bl57, boolean bl58, boolean bl59, boolean bl60, boolean bl61, boolean bl62, boolean bl63, String string49, Double d2, boolean bl64, boolean bl65, boolean bl66, boolean bl67, boolean bl68, boolean bl69, boolean bl70, boolean bl71, boolean bl72, boolean bl73, boolean bl74, boolean bl75, boolean bl76, boolean bl77, boolean bl78, boolean bl79, boolean bl80, boolean bl81, boolean bl82, boolean bl83, boolean bl84, boolean bl85, boolean bl86, boolean bl87, boolean bl88, boolean bl89, boolean bl90, boolean bl91, boolean bl92, boolean bl93, boolean bl94, boolean bl95, boolean bl96) {
        this.brandName = string2;
        this.productName = string3;
        this.productCode = string4;
        this.productColorCode = string5;
        this.viewTypeWishlist = n3;
        this.productType = homeWidgetTypes;
        this.viewHolderPos = n4;
        this.isAjiogramStoreId = bl2;
        this.productImageUrl = string6;
        this.productImageContentDescription = string7;
        this.extraImagesUrlList = arrayList;
        this.productImgPlaceholerDescription = string8;
        this.isSimilarProductEnabled = bl3;
        this.similarProductType = string9;
        this.similarIconContentDescription = string10;
        this.isProductWishlisted = bl4;
        this.wishlistCountShortText = string11;
        this.wishlistCountLongText = string12;
        this.isWishlistCountAvailable = bl5;
        this.closetButtonContentDescription = string13;
        this.closetAddedButtonContentDescription = string14;
        this.closetSimilarContentDescription = string15;
        this.showProductTags = bl6;
        this.showAdTag = bl7;
        this.productTagValue = string16;
        this.productTagViewContentDescription = string17;
        this.isPlpUrgencyTagEnabled = bl8;
        this.urgencyTagValue = string18;
        this.isPlpBargainUrgencyTagEnabled = bl9;
        this.bargainUrgencyTagValue = string19;
        this.isAjiogramProduct = bl10;
        this.showSizeLayout = bl11;
        this.showSizeVariants = bl12;
        this.showSizeFirstView = bl13;
        this.showSizeSecondView = bl14;
        this.showSizeThirdView = bl15;
        this.showSizeFourthView = bl16;
        this.showSizeCount = bl17;
        this.sizeFirstViewText = string20;
        this.sizeSecondViewText = string21;
        this.sizeThirdViewText = string22;
        this.sizeFourthViewText = string23;
        this.sizeCountText = string24;
        this.showSizeView = bl18;
        this.sizeContentDescription = string25;
        this.showAddedToCart = bl19;
        this.enableAddtoBag = bl20;
        this.isComingSoonEnable = bl21;
        this.isAfterCartLuxEnabled = bl22;
        this.isSimilarOOSWishListAjioANDOOSBagEnabled = bl23;
        this.isSimilarOOSWishListLuxeANDOOSBagEnabled = bl24;
        this.isHeaderNotEmpty = bl25;
        this.headerText = string26;
        this.variantOptions = list;
        this.productOptionVariants = list2;
        this.populateSelectSizeLabel = bl26;
        this.deleteWishlistContentDescription = string27;
        this.addToBagContentDescription = string28;
        this.oosSimilarContentDescription = string29;
        this.closetAddBagContentDescription = string30;
        this.isImageLoaded = bl27;
        this.isLuxeCartPriceEnable = bl28;
        this.isAllOutOfStock = bl29;
        this.closetAddBagText = string31;
        this.addedToCartText = string32;
        this.checkIfTalkbackServiceEnabled = bl30;
        this.isSimilarOOSWishlistEnabled = bl31;
        this.isSelectionMode = bl32;
        this.isPositionSelected = bl33;
        this.isSimilarOOSWishlistLuxeEnabled = bl34;
        this.fnlColorVariantData = productFnlColorVariantData;
        this.isAllPromotions = bl35;
        this.promoContentDescription = string33;
        this.cardUi = bl36;
        this.isFromHomeProductWidget = bl37;
        this.isPriceDropReqd = bl38;
        this.recentlyViewedProdPrice = bl39;
        this.priceDropValue = bl40;
        this.priceDrop = string34;
        this.pdpInfoProviderLuxeEnable = bl41;
        this.shouldShowProductDescription = bl42;
        this.promoImageurl = string35;
        this.accBannerDesc = string36;
        this.colorGroup = string37;
        this.showOODEnable = bl43;
        this.isPrioritydeliveryFeatureEnable = bl44;
        this.deliverySlaTag = string38;
        this.showFinalPrice = bl45;
        this.finalPriceValue = string39;
        this.finalPriceContentDescription = string40;
        this.showMrpPrice = bl46;
        this.mrpPriceValue = spannableString;
        this.mrpPriceContentDescription = string41;
        this.showDiscountPrice = bl47;
        this.discountPriceValue = string42;
        this.discountPriceContentDescription = string43;
        this.setDiscountColor = bl48;
        this.wasPriceValue = f5;
        this.priceValue = f6;
        this.bestPriceValue = f7;
        this.discountPercentValue = string44;
        this.offerPrice = string45;
        this.isDodEnabled = bl49;
        this.dodEndTime = l2;
        this.offerPriceValue = string46;
        this.showOfferPrice = bl50;
        this.offerPriceContentDescription = string47;
        this.setOfferPriceDrawable = bl51;
        this.setOfferPrice = bl52;
        this.isGwpEnabled = bl53;
        this.isGiftAvailable = bl54;
        this.gwpFreebiesOneText = string48;
        this.isLuxeEnabled = bl55;
        this.isGWPFeatureEnabledAjioLuxe = bl56;
        this.isPreSalePlp = bl57;
        this.isSaleWishlist = bl58;
        this.enableSaleContainer = bl59;
        this.isLuxeAfercartAndLuxeEnable = bl60;
        this.isSaleContainerSpaceRetained = bl61;
        this.isRatingEnabledPlp = bl62;
        this.isRatingStarDisplayEnabled = bl63;
        this.productRatingCount = string49;
        this.averageRating = d2;
        this.showAjiogramTag = bl64;
        this.showPlpGrid = bl65;
        this.productTextWrap = bl66;
        this.enableAddtoCart = bl67;
        this.enableCartClosetSizeLayout = bl68;
        this.enableCartClosetSelectSize = bl69;
        this.enabledeleteImg = bl70;
        this.enableSimilarCartClosetCLick = bl71;
        this.enableAddToBagCartClosetClick = bl72;
        this.enableDeleteOssContainer = bl73;
        this.enableOOSTV = bl74;
        this.enableOOSBG = bl75;
        this.enableOutOfStock = bl76;
        this.enableAddedToBag = bl77;
        this.enableCartClosetAddToBag = bl78;
        this.closetSelectionEnable = bl79;
        this.isRecentlyViewLayoutChanges = bl80;
        this.isPromoImageAvailable = bl81;
        this.isPriceValueChanges = bl82;
        this.enableFreebie = bl83;
        this.enableWishlistView = bl84;
        this.enableComingSoonProducts = bl85;
        this.sellingFastTag = bl86;
        this.layoutWidthChangesRequired = bl87;
        this.enablebackground = bl88;
        this.enableRatingView = bl89;
        this.cartClosetClickListners = bl90;
        this.cartClickListners = bl91;
        this.luxeCartClickListners = bl92;
        this.recentViewclickListners = bl93;
        this.newProductViewClickListeners = bl94;
        this.productClicklisteners = bl95;
        this.isRecentlyWidgetEnable = bl96;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ PlpProductUIModel(String object, String string2, String string3, String string4, Integer object2, HomeWidgetTypes object3, int n3, boolean bl2, String string5, String string6, ArrayList object4, String object5, boolean bl3, String string7, String object6, boolean bl4, String string8, String string9, boolean bl5, String string10, String string11, String string12, boolean bl6, boolean bl7, String string13, String string14, boolean bl8, String string15, boolean bl9, String string16, Boolean object7, boolean bl10, boolean bl11, boolean bl12, boolean bl13, boolean bl14, boolean bl15, boolean bl16, String string17, String string18, String string19, String string20, String string21, boolean bl17, String string22, boolean bl18, boolean bl19, boolean bl20, boolean bl21, boolean bl22, boolean bl23, boolean bl24, String string23, List object8, List list, boolean bl25, String string24, String string25, String string26, String string27, boolean bl26, boolean bl27, boolean bl28, String string28, String string29, boolean bl29, boolean bl30, boolean bl31, boolean bl32, boolean bl33, ProductFnlColorVariantData productFnlColorVariantData, boolean bl34, String string30, boolean bl35, boolean bl36, boolean bl37, boolean bl38, boolean bl39, String string31, boolean bl40, boolean bl41, String string32, String string33, String string34, boolean bl42, boolean bl43, String string35, boolean bl44, String string36, String string37, boolean bl45, SpannableString spannableString, String string38, boolean bl46, String string39, String string40, boolean bl47, Float f5, Float f6, Float f7, String object9, String string41, boolean bl48, long l2, String string42, boolean bl49, String string43, boolean bl50, boolean bl51, boolean bl52, boolean bl53, String string44, boolean bl54, boolean bl55, boolean bl56, boolean bl57, boolean bl58, boolean bl59, boolean bl60, boolean bl61, boolean bl62, String string45, Double object10, boolean bl63, boolean bl64, boolean bl65, boolean bl66, boolean bl67, boolean bl68, boolean bl69, boolean bl70, boolean bl71, boolean bl72, boolean bl73, boolean bl74, boolean bl75, boolean bl76, boolean bl77, boolean bl78, boolean bl79, boolean bl80, boolean bl81, boolean bl82, boolean bl83, boolean bl84, boolean bl85, boolean bl86, boolean bl87, boolean bl88, boolean bl89, boolean bl90, boolean bl91, boolean bl92, boolean bl93, boolean bl94, boolean bl95, int n4, int n7, int n8, int n10, int n14, DefaultConstructorMarker defaultConstructorMarker) {
        void var338_503;
        void var318_457;
        void var303_439;
        void var298_431;
        void var293_423;
        void var290_417;
        void var282_403;
        void var270_385;
        void var262_362;
        void var251_342;
        void var244_332;
        void var230_303;
        void var219_277;
        void var216_271;
        void var211_263;
        void var202_248;
        void var194_237;
        void var182_211;
        void var367_583;
        void var366_579;
        void var365_575;
        void var364_571;
        void var363_567;
        void var362_563;
        void var361_559;
        void var353_548;
        void var352_544;
        void var351_540;
        void var350_536;
        void var349_532;
        void var348_528;
        void var346_523;
        void var345_519;
        void var344_515;
        void var343_511;
        void var337_499;
        void var336_495;
        void var335_491;
        void var334_487;
        void var333_483;
        void var332_479;
        void var331_475;
        void var330_471;
        void var289_413;
        void var281_399;
        void var269_381;
        void var268_377;
        void var267_373;
        void var266_369;
        void var261_358;
        void var260_354;
        void var243_328;
        void var242_324;
        void var241_320;
        void var240_316;
        void var229_299;
        void var228_295;
        void var227_291;
        void var226_287;
        void var210_259;
        void var157_183;
        void var156_182;
        void var155_181;
        void var154_180;
        void var153_179;
        void var152_178;
        void var151_177;
        void var149_173;
        void var148_171;
        void var147_169;
        void var146_167;
        void var145_165;
        void var144_163;
        void var143_161;
        void var142_159;
        void var141_157;
        void var140_155;
        void var139_153;
        void var138_151;
        void var137_150;
        void var136_149;
        void var135_148;
        void var134_147;
        void var133_146;
        void var132_145;
        void var130_141;
        void var129_140;
        void var128_139;
        void var127_138;
        void var126_137;
        String string46;
        Double d2;
        String string47;
        void var122_133;
        void var121_132;
        void var120_131;
        void var119_130;
        void var118_129;
        void var117_128;
        void var116_127;
        void var115_126;
        String string48;
        void var104_113;
        String string49;
        String string50;
        Float f8;
        String string51;
        Float f11;
        Float f12;
        Float f14;
        Float f15;
        Float f16;
        void var97_106;
        String string52;
        String string53;
        String string54;
        SpannableString spannableString2;
        String string55;
        SpannableString spannableString3;
        String string56;
        String string57;
        String string58;
        String string59;
        void var86_95;
        String string60;
        String string61;
        String string62;
        String string63;
        String string64;
        void var81_90;
        ProductFnlColorVariantData productFnlColorVariantData2;
        void var70_75;
        void var69_74;
        void var68_73;
        void var67_72;
        String string65;
        String string66;
        String string67;
        void var63_68;
        void var62_67;
        String string68;
        String string69;
        String string70;
        String string71;
        String string72;
        String string73;
        String string74;
        List list2;
        List list3;
        String string75;
        List list4;
        String string76;
        void var52_57;
        void var51_56;
        void var50_55;
        void var49_54;
        String string77;
        String string78;
        String string79;
        String string80;
        String string81;
        void var38_41;
        void var37_40;
        void var36_39;
        void var35_38;
        void var33_34;
        String string82;
        String string83;
        Boolean bl96;
        String string84;
        String string85;
        String string86;
        String string87;
        String string88;
        void var24_25;
        String string89;
        String string90;
        String string91;
        String string92;
        String string93;
        String string94;
        String string95;
        String string96;
        String string97;
        void var187_223;
        void var12_13;
        String string98;
        String string99;
        String string100;
        String string101;
        String string102;
        Object object11;
        String string103;
        String string104;
        String string105;
        Object object12;
        void var162_188;
        int bl97;
        void var160_186;
        void var159_185;
        int bl98;
        int bl99 = bl98;
        int bl100 = var159_185;
        int bl101 = var160_186;
        int bl102 = bl97;
        int bl103 = var162_188;
        int n15 = bl98 & 1;
        if (n15 != 0) {
            n15 = 0;
            object12 = null;
        } else {
            object12 = object;
        }
        int n16 = bl99 & 2;
        if (n16 != 0) {
            n16 = 0;
            string105 = null;
        } else {
            string105 = string2;
        }
        int n17 = bl99 & 4;
        if (n17 != 0) {
            n17 = 0;
            string104 = null;
        } else {
            string104 = string3;
        }
        int n18 = bl99 & 8;
        if (n18 != 0) {
            n18 = 0;
            string103 = null;
        } else {
            string103 = string4;
        }
        int n19 = bl99 & 0x10;
        if (n19 != 0) {
            n19 = 0;
            object11 = null;
        } else {
            object11 = object2;
        }
        int n20 = bl99 & 0x20;
        Object object13 = n20 != 0 ? HomeWidgetTypes.HOME_WIDGET_TYPE_PRODUCT : object3;
        int n21 = bl99 & 0x40;
        n21 = n21 != 0 ? -1 : n3;
        int n22 = bl99 & 0x80;
        if (n22 != 0) {
            boolean bl104 = false;
        } else {
            boolean bl105 = bl2;
        }
        int n24 = bl99 & 0x100;
        if (n24 != 0) {
            n24 = 0;
            string102 = null;
        } else {
            void var9_10;
            string102 = var9_10;
        }
        int n25 = bl99 & 0x200;
        if (n25 != 0) {
            n25 = 0;
            string101 = null;
        } else {
            string101 = string100;
        }
        int n26 = bl99 & 0x400;
        if (n26 != 0) {
            boolean bl106 = false;
            string99 = null;
        } else {
            string99 = string98;
        }
        void var189_229 = string99;
        int n27 = bl99 & 0x800;
        if (n27 != 0) {
            boolean bl107 = false;
            string99 = null;
        } else {
            string99 = var12_13;
        }
        String string106 = string99;
        int n28 = bl99 & 0x1000;
        if (n28 != 0) {
            boolean bl108 = false;
            string99 = null;
        } else {
            void var13_14;
            void var187_222 = var13_14;
        }
        void var191_231 = var187_223;
        int n29 = bl99 & 0x2000;
        if (n29 != 0) {
            boolean bl109 = false;
            string99 = null;
        } else {
            void var14_15;
            string99 = var14_15;
        }
        String string107 = string99;
        int n30 = bl99 & 0x4000;
        if (n30 != 0) {
            boolean bl110 = false;
            string99 = null;
        } else {
            string99 = string97;
        }
        int n32 = 32768;
        int n34 = bl99 & n32;
        if (n34 != 0) {
            boolean bl111 = false;
        } else {
            void var16_17;
            void var194_236 = var16_17;
        }
        int n35 = 65536;
        int n36 = bl99 & n35;
        if (n36 != 0) {
            n36 = 0;
            string96 = null;
        } else {
            void var17_18;
            string96 = var17_18;
        }
        int n37 = 131072;
        int n38 = bl99 & n37;
        if (n38 != 0) {
            n38 = 0;
            string95 = null;
        } else {
            string95 = string94;
        }
        int n39 = 262144;
        int n41 = bl99 & n39;
        if (n41 != 0) {
            boolean bl112 = false;
        } else {
            void var19_20;
            void var202_247 = var19_20;
        }
        int n42 = 524288;
        int n43 = bl99 & n42;
        if (n43 != 0) {
            n43 = 0;
            string93 = null;
        } else {
            void var20_21;
            string93 = var20_21;
        }
        int n44 = bl99 & 0x100000;
        if (n44 != 0) {
            n44 = 0;
            string92 = null;
        } else {
            string92 = string91;
        }
        int n45 = bl99 & 0x200000;
        if (n45 != 0) {
            n45 = 0;
            string90 = null;
        } else {
            string90 = string89;
        }
        int n46 = bl99 & 0x400000;
        if (n46 != 0) {
            boolean bl113 = false;
        } else {
            void var23_24;
            void var210_258 = var23_24;
        }
        int n47 = bl99 & 0x800000;
        if (n47 != 0) {
            boolean bl114 = false;
        } else {
            void var211_262 = var24_25;
        }
        int n48 = bl99 & 0x1000000;
        if (n48 != 0) {
            n48 = 0;
            string88 = null;
        } else {
            void var25_26;
            string88 = var25_26;
        }
        int n49 = bl99 & 0x2000000;
        if (n49 != 0) {
            n49 = 0;
            string87 = null;
        } else {
            string87 = string86;
        }
        int n50 = bl99 & 0x4000000;
        if (n50 != 0) {
            boolean bl115 = false;
        } else {
            void var27_28;
            void var216_270 = var27_28;
        }
        int n51 = bl99 & 0x8000000;
        if (n51 != 0) {
            n51 = 0;
            string85 = null;
        } else {
            void var28_29;
            string85 = var28_29;
        }
        int n52 = bl99 & 0x10000000;
        if (n52 != 0) {
            boolean bl116 = false;
        } else {
            void var29_30;
            void var219_276 = var29_30;
        }
        int n54 = bl99 & 0x20000000;
        if (n54 != 0) {
            n54 = 0;
            string84 = null;
        } else {
            void var30_31;
            string84 = var30_31;
        }
        int n55 = bl99 & 0x40000000;
        if (n55 != 0) {
            n55 = 0;
            bl96 = null;
        } else {
            bl96 = string83;
        }
        int n56 = -1 << -1;
        if (bl99 &= n56) {
            bl99 = 0;
            string82 = null;
        } else {
            void var32_33;
            bl99 = var32_33;
        }
        n56 = bl100 & 1;
        n56 = n56 != 0 ? 0 : var33_34;
        int n57 = bl100 & 2;
        if (n57 != 0) {
            boolean bl117 = false;
        } else {
            void var34_36;
            void var226_286 = var34_36;
        }
        int n58 = bl100 & 4;
        if (n58 != 0) {
            boolean bl118 = false;
        } else {
            void var227_290 = var35_38;
        }
        int n59 = bl100 & 8;
        if (n59 != 0) {
            boolean bl119 = false;
        } else {
            void var228_294 = var36_39;
        }
        int n60 = bl100 & 0x10;
        if (n60 != 0) {
            boolean bl120 = false;
        } else {
            void var229_298 = var37_40;
        }
        int n64 = bl100 & 0x20;
        if (n64 != 0) {
            boolean bl121 = false;
        } else {
            void var230_302 = var38_41;
        }
        int n65 = bl100 & 0x40;
        if (n65 != 0) {
            n65 = 0;
            string81 = null;
        } else {
            void var39_42;
            string81 = var39_42;
        }
        bl98 = bl99;
        bl99 = bl100 & 0x80;
        if (bl99) {
            bl99 = 0;
            string82 = null;
        } else {
            string82 = string80;
        }
        String string108 = string82;
        bl99 = bl100 & 0x100;
        if (bl99) {
            bl99 = 0;
            string82 = null;
        } else {
            string82 = string79;
        }
        String string109 = string82;
        bl99 = bl100 & 0x200;
        if (bl99) {
            bl99 = 0;
            string82 = null;
        } else {
            string82 = string78;
        }
        String string110 = string82;
        bl99 = bl100 & 0x400;
        if (bl99) {
            bl99 = 0;
            string82 = null;
        } else {
            string82 = string77;
        }
        String string111 = string82;
        bl99 = bl100 & 0x800;
        if (bl99) {
            bl99 = 0;
            string82 = null;
        } else {
            void var44_47;
            bl99 = var44_47;
        }
        int bl122 = bl99;
        bl99 = bl100 & 0x1000;
        if (bl99) {
            bl99 = 0;
            string82 = null;
        } else {
            void var45_48;
            string82 = var45_48;
        }
        String string112 = string82;
        bl99 = bl100 & 0x2000;
        if (bl99) {
            bl99 = 0;
            string82 = null;
        } else {
            void var46_49;
            bl99 = var46_49;
        }
        int bl123 = bl99;
        bl99 = bl100 & 0x4000;
        if (bl99) {
            bl99 = 0;
            string82 = null;
        } else {
            void var47_50;
            bl99 = var47_50;
        }
        int n66 = bl100 & n32;
        if (n66 != 0) {
            boolean bl124 = false;
        } else {
            void var48_52;
            void var240_315 = var48_52;
        }
        int n67 = bl100 & n35;
        if (n67 != 0) {
            boolean bl125 = false;
        } else {
            void var241_319 = var49_54;
        }
        int n68 = bl100 & n37;
        if (n68 != 0) {
            boolean bl126 = false;
        } else {
            void var242_323 = var50_55;
        }
        int n69 = bl100 & n39;
        if (n69 != 0) {
            boolean bl127 = false;
        } else {
            void var243_327 = var51_56;
        }
        int n71 = bl100 & n42;
        if (n71 != 0) {
            boolean bl128 = false;
        } else {
            void var244_331 = var52_57;
        }
        int n74 = bl100 & 0x100000;
        if (n74 != 0) {
            n74 = 0;
            string76 = null;
        } else {
            void var53_58;
            string76 = var53_58;
        }
        int n75 = bl100 & 0x200000;
        if (n75 != 0) {
            n75 = 0;
            list4 = null;
        } else {
            list4 = string75;
        }
        int n76 = bl100 & 0x400000;
        if (n76 != 0) {
            n76 = 0;
            list3 = null;
        } else {
            list3 = list2;
        }
        int n77 = bl100 & 0x800000;
        if (n77 != 0) {
            boolean bl129 = false;
        } else {
            void var56_61;
            void var251_341 = var56_61;
        }
        int n78 = bl100 & 0x1000000;
        if (n78 != 0) {
            n78 = 0;
            string74 = null;
        } else {
            void var57_62;
            string74 = var57_62;
        }
        int n79 = bl100 & 0x2000000;
        if (n79 != 0) {
            n79 = 0;
            string73 = null;
        } else {
            string73 = string72;
        }
        int n80 = bl100 & 0x4000000;
        if (n80 != 0) {
            n80 = 0;
            string71 = null;
        } else {
            string71 = string70;
        }
        int n81 = bl100 & 0x8000000;
        if (n81 != 0) {
            n81 = 0;
            string69 = null;
        } else {
            string69 = string68;
        }
        int n84 = bl100 & 0x10000000;
        if (n84 != 0) {
            boolean bl130 = false;
        } else {
            void var61_66;
            void var260_353 = var61_66;
        }
        int n85 = bl100 & 0x20000000;
        if (n85 != 0) {
            boolean bl131 = false;
        } else {
            void var261_357 = var62_67;
        }
        int n86 = bl100 & 0x40000000;
        if (n86 != 0) {
            boolean bl132 = false;
        } else {
            void var262_361 = var63_68;
        }
        int n87 = -1 << -1;
        if (bl100 &= n87) {
            bl100 = 0;
            string67 = null;
        } else {
            void var64_69;
            string67 = var64_69;
        }
        n87 = bl101 & 1;
        if (n87 != 0) {
            n87 = 0;
            string66 = null;
        } else {
            string66 = string65;
        }
        int n88 = bl101 & 2;
        if (n88 != 0) {
            boolean bl133 = false;
        } else {
            void var66_71;
            void var266_368 = var66_71;
        }
        int n89 = bl101 & 4;
        if (n89 != 0) {
            boolean bl134 = false;
        } else {
            void var267_372 = var67_72;
        }
        int n92 = bl101 & 8;
        if (n92 != 0) {
            boolean bl135 = false;
        } else {
            void var268_376 = var68_73;
        }
        int n93 = bl101 & 0x10;
        if (n93 != 0) {
            boolean bl136 = false;
        } else {
            void var269_380 = var69_74;
        }
        int n94 = bl101 & 0x20;
        if (n94 != 0) {
            boolean bl137 = false;
        } else {
            void var270_384 = var70_75;
        }
        int n95 = bl101 & 0x40;
        if (n95 != 0) {
            n95 = 0;
            productFnlColorVariantData2 = null;
        } else {
            void var71_76;
            productFnlColorVariantData2 = var71_76;
        }
        String string113 = string67;
        bl100 = bl101 & 0x80;
        if (bl100) {
            bl100 = 0;
            string67 = null;
        } else {
            void var72_77;
            bl100 = var72_77;
        }
        int bl138 = bl100;
        bl100 = bl101 & 0x100;
        if (bl100) {
            bl100 = 0;
            string67 = null;
        } else {
            void var73_78;
            string67 = var73_78;
        }
        String string114 = string67;
        bl100 = bl101 & 0x200;
        if (bl100) {
            bl100 = 0;
            string67 = null;
        } else {
            void var74_79;
            bl100 = var74_79;
        }
        int bl139 = bl100;
        bl100 = bl101 & 0x400;
        if (bl100) {
            bl100 = 0;
            string67 = null;
        } else {
            void var75_80;
            bl100 = var75_80;
        }
        int bl140 = bl100;
        bl100 = bl101 & 0x800;
        if (bl100) {
            bl100 = 0;
            string67 = null;
        } else {
            void var76_82;
            bl100 = var76_82;
        }
        int bl141 = bl100;
        bl100 = bl101 & 0x1000;
        if (bl100) {
            bl100 = 0;
            string67 = null;
        } else {
            void var77_84;
            bl100 = var77_84;
        }
        int bl142 = bl100;
        bl100 = bl101 & 0x2000;
        if (bl100) {
            bl100 = 0;
            string67 = null;
        } else {
            void var78_86;
            bl100 = var78_86;
        }
        int bl143 = bl100;
        bl100 = bl101 & 0x4000;
        if (bl100) {
            bl100 = 0;
            string67 = null;
        } else {
            void var79_88;
            string67 = var79_88;
        }
        int n96 = bl101 & n32;
        if (n96 != 0) {
            boolean bl144 = false;
        } else {
            void var80_89;
            void var281_398 = var80_89;
        }
        int n97 = bl101 & n35;
        if (n97 != 0) {
            boolean bl145 = false;
        } else {
            void var282_402 = var81_90;
        }
        int n98 = bl101 & n37;
        if (n98 != 0) {
            n98 = 0;
            string64 = null;
        } else {
            void var82_91;
            string64 = var82_91;
        }
        int n99 = bl101 & n39;
        if (n99 != 0) {
            n99 = 0;
            string63 = null;
        } else {
            string63 = string62;
        }
        int n100 = bl101 & n42;
        if (n100 != 0) {
            n100 = 0;
            string61 = null;
        } else {
            string61 = string60;
        }
        int n101 = bl101 & 0x100000;
        if (n101 != 0) {
            boolean bl146 = false;
        } else {
            void var85_94;
            void var289_412 = var85_94;
        }
        int n102 = bl101 & 0x200000;
        if (n102 != 0) {
            boolean bl147 = false;
        } else {
            void var290_416 = var86_95;
        }
        int n103 = bl101 & 0x400000;
        if (n103 != 0) {
            n103 = 0;
            string59 = null;
        } else {
            void var87_96;
            string59 = var87_96;
        }
        int n104 = bl101 & 0x800000;
        if (n104 != 0) {
            boolean bl148 = false;
        } else {
            void var88_97;
            void var293_422 = var88_97;
        }
        int n105 = bl101 & 0x1000000;
        if (n105 != 0) {
            n105 = 0;
            string58 = null;
        } else {
            void var89_98;
            string58 = var89_98;
        }
        int n106 = bl101 & 0x2000000;
        if (n106 != 0) {
            n106 = 0;
            string57 = null;
        } else {
            string57 = string56;
        }
        int n107 = bl101 & 0x4000000;
        if (n107 != 0) {
            boolean bl149 = false;
        } else {
            void var91_100;
            void var298_430 = var91_100;
        }
        int n108 = bl101 & 0x8000000;
        if (n108 != 0) {
            n108 = 0;
            spannableString3 = null;
        } else {
            void var92_101;
            spannableString3 = var92_101;
        }
        int n109 = bl101 & 0x10000000;
        if (n109 != 0) {
            n109 = 0;
            string55 = null;
        } else {
            string55 = spannableString2;
        }
        int n110 = bl101 & 0x20000000;
        if (n110 != 0) {
            boolean bl150 = false;
        } else {
            void var94_103;
            void var303_438 = var94_103;
        }
        int n111 = bl101 & 0x40000000;
        if (n111 != 0) {
            n111 = 0;
            string54 = null;
        } else {
            void var95_104;
            string54 = var95_104;
        }
        int n112 = -1 << -1;
        if (bl101 &= n112) {
            bl101 = 0;
            string53 = null;
        } else {
            string53 = string52;
        }
        n112 = bl102 & 1;
        n112 = n112 != 0 ? 0 : var97_106;
        int n113 = bl102 & 2;
        if (n113 != 0) {
            n113 = 0;
            f16 = null;
        } else {
            void var98_107;
            f16 = var98_107;
        }
        int n114 = bl102 & 4;
        if (n114 != 0) {
            n114 = 0;
            f15 = null;
        } else {
            f15 = f14;
        }
        int n115 = bl102 & 8;
        if (n115 != 0) {
            n115 = 0;
            f12 = null;
        } else {
            f12 = f11;
        }
        int n116 = bl102 & 0x10;
        if (n116 != 0) {
            n116 = 0;
            string51 = null;
        } else {
            string51 = f8;
        }
        int n117 = bl102 & 0x20;
        if (n117 != 0) {
            n117 = 0;
            string50 = null;
        } else {
            string50 = string49;
        }
        int n118 = bl102 & 0x40;
        if (n118 != 0) {
            boolean bl151 = false;
        } else {
            void var103_112;
            void var318_456 = var103_112;
        }
        String string115 = string53;
        bl101 = bl102 & 0x80;
        long l3 = bl101 ? 0L : var104_113;
        bl101 = bl102 & 0x100;
        if (bl101) {
            bl101 = 0;
            string53 = null;
        } else {
            void var106_114;
            string53 = var106_114;
        }
        String string116 = string53;
        bl101 = bl102 & 0x200;
        if (bl101) {
            bl101 = 0;
            string53 = null;
        } else {
            void var107_115;
            bl101 = var107_115;
        }
        int bl152 = bl101;
        bl101 = bl102 & 0x400;
        if (bl101) {
            bl101 = 0;
            string53 = null;
        } else {
            void var108_116;
            string53 = var108_116;
        }
        String string117 = string53;
        bl101 = bl102 & 0x800;
        if (bl101) {
            bl101 = 0;
            string53 = null;
        } else {
            void var109_117;
            bl101 = var109_117;
        }
        int bl153 = bl101;
        bl101 = bl102 & 0x1000;
        if (bl101) {
            bl101 = 0;
            string53 = null;
        } else {
            void var110_118;
            bl101 = var110_118;
        }
        int bl154 = bl101;
        bl101 = bl102 & 0x2000;
        if (bl101) {
            bl101 = 0;
            string53 = null;
        } else {
            void var111_120;
            bl101 = var111_120;
        }
        int bl155 = bl101;
        bl101 = bl102 & 0x4000;
        if (bl101) {
            bl101 = 0;
            string53 = null;
        } else {
            void var112_122;
            bl101 = var112_122;
        }
        int n119 = bl102 & n32;
        if (n119 != 0) {
            n119 = 0;
            string48 = null;
        } else {
            void var113_124;
            string48 = var113_124;
        }
        int n120 = bl102 & n35;
        if (n120 != 0) {
            boolean bl156 = false;
        } else {
            void var114_125;
            void var330_470 = var114_125;
        }
        int n121 = bl102 & n37;
        if (n121 != 0) {
            boolean bl157 = false;
        } else {
            void var331_474 = var115_126;
        }
        int n122 = bl102 & n39;
        if (n122 != 0) {
            boolean bl158 = false;
        } else {
            void var332_478 = var116_127;
        }
        int n123 = bl102 & n42;
        if (n123 != 0) {
            boolean bl159 = false;
        } else {
            void var333_482 = var117_128;
        }
        int n124 = bl102 & 0x100000;
        if (n124 != 0) {
            boolean bl160 = false;
        } else {
            void var334_486 = var118_129;
        }
        int n125 = bl102 & 0x200000;
        if (n125 != 0) {
            boolean bl161 = false;
        } else {
            void var335_490 = var119_130;
        }
        int n126 = bl102 & 0x400000;
        if (n126 != 0) {
            boolean bl162 = false;
        } else {
            void var336_494 = var120_131;
        }
        int n127 = bl102 & 0x800000;
        if (n127 != 0) {
            boolean bl163 = false;
        } else {
            void var337_498 = var121_132;
        }
        int n128 = bl102 & 0x1000000;
        if (n128 != 0) {
            boolean bl164 = false;
        } else {
            void var338_502 = var122_133;
        }
        int n129 = bl102 & 0x2000000;
        if (n129 != 0) {
            n129 = 0;
            string47 = null;
        } else {
            void var123_134;
            string47 = var123_134;
        }
        int n130 = bl102 & 0x4000000;
        if (n130 != 0) {
            n130 = 0;
            d2 = null;
        } else {
            d2 = string46;
        }
        int n131 = bl102 & 0x8000000;
        if (n131 != 0) {
            boolean bl165 = false;
        } else {
            void var125_136;
            void var343_510 = var125_136;
        }
        int n132 = bl102 & 0x10000000;
        if (n132 != 0) {
            boolean bl166 = false;
        } else {
            void var344_514 = var126_137;
        }
        int n133 = bl102 & 0x20000000;
        if (n133 != 0) {
            boolean bl167 = false;
        } else {
            void var345_518 = var127_138;
        }
        int n134 = bl102 & 0x40000000;
        if (n134 != 0) {
            boolean bl168 = false;
        } else {
            void var346_522 = var128_139;
        }
        int n135 = -1 << -1;
        bl102 = (bl102 &= n135) ? 0 : var129_140;
        n135 = bl103 & 1;
        n135 = n135 != 0 ? 0 : var130_141;
        int n136 = bl103 & 2;
        if (n136 != 0) {
            boolean bl169 = false;
        } else {
            void var131_143;
            void var348_527 = var131_143;
        }
        int n137 = bl103 & 4;
        if (n137 != 0) {
            boolean bl170 = false;
        } else {
            void var349_531 = var132_145;
        }
        int n138 = bl103 & 8;
        if (n138 != 0) {
            boolean bl171 = false;
        } else {
            void var350_535 = var133_146;
        }
        int n139 = bl103 & 0x10;
        if (n139 != 0) {
            boolean bl172 = false;
        } else {
            void var351_539 = var134_147;
        }
        int n140 = bl103 & 0x20;
        if (n140 != 0) {
            boolean bl173 = false;
        } else {
            void var352_543 = var135_148;
        }
        int n141 = bl103 & 0x40;
        if (n141 != 0) {
            boolean bl174 = false;
        } else {
            void var353_547 = var136_149;
        }
        bl97 = bl102;
        bl102 = bl103 & 0x80;
        bl102 = bl102 ? 0 : var137_150;
        int bl175 = bl102;
        bl102 = bl103 & 0x100;
        bl102 = bl102 ? 0 : var138_151;
        int bl176 = bl102;
        bl102 = bl103 & 0x200;
        bl102 = bl102 ? 0 : var139_153;
        int bl177 = bl102;
        bl102 = bl103 & 0x400;
        bl102 = bl102 ? 0 : var140_155;
        int bl178 = bl102;
        bl102 = bl103 & 0x800;
        bl102 = bl102 ? 0 : var141_157;
        int bl179 = bl102;
        bl102 = bl103 & 0x1000;
        bl102 = bl102 ? 0 : var142_159;
        int bl180 = bl102;
        bl102 = bl103 & 0x2000;
        bl102 = bl102 ? 0 : var143_161;
        int bl181 = bl102;
        bl102 = bl103 & 0x4000;
        bl102 = bl102 ? 0 : var144_163;
        n32 = bl103 & n32;
        n32 = n32 != 0 ? 0 : var145_165;
        n35 = bl103 & n35;
        n35 = n35 != 0 ? 0 : var146_167;
        n37 = bl103 & n37;
        n37 = n37 != 0 ? 0 : var147_169;
        n39 = bl103 & n39;
        n39 = n39 != 0 ? 0 : var148_171;
        n42 = bl103 & n42;
        n42 = n42 != 0 ? 0 : var149_173;
        int n142 = bl103 & 0x100000;
        if (n142 != 0) {
            boolean bl182 = false;
        } else {
            void var150_175;
            void var361_558 = var150_175;
        }
        int n143 = bl103 & 0x200000;
        if (n143 != 0) {
            boolean bl183 = false;
        } else {
            void var362_562 = var151_177;
        }
        int n144 = bl103 & 0x400000;
        if (n144 != 0) {
            boolean bl184 = false;
        } else {
            void var363_566 = var152_178;
        }
        int n145 = bl103 & 0x800000;
        if (n145 != 0) {
            boolean bl185 = false;
        } else {
            void var364_570 = var153_179;
        }
        int n146 = bl103 & 0x1000000;
        if (n146 != 0) {
            boolean bl186 = false;
        } else {
            void var365_574 = var154_180;
        }
        int n147 = bl103 & 0x2000000;
        if (n147 != 0) {
            boolean bl187 = false;
        } else {
            void var366_578 = var155_181;
        }
        int n148 = bl103 & 0x4000000;
        if (n148 != 0) {
            boolean bl188 = false;
        } else {
            void var367_582 = var156_182;
        }
        int n149 = 0x8000000;
        bl103 = (bl103 &= n149) ? 0 : var157_183;
        object = this;
        string2 = object12;
        string3 = string105;
        string4 = string104;
        object2 = string103;
        object3 = object11;
        int n150 = n21;
        string100 = string102;
        string98 = string101;
        var12_13 = var189_229;
        string97 = string107;
        string94 = string96;
        string91 = string93;
        string89 = string92;
        var24_25 = var210_259;
        string86 = string88;
        string83 = string84;
        int bl189 = bl98;
        int n151 = n56;
        var35_38 = var226_287;
        var36_39 = var227_291;
        var37_40 = var228_295;
        var38_41 = var229_299;
        string80 = string81;
        string79 = string108;
        string78 = string109;
        string77 = string110;
        int bl190 = bl123;
        int bl191 = bl99;
        var49_54 = var240_316;
        var50_55 = var241_320;
        var51_56 = var242_324;
        var52_57 = var243_328;
        string75 = string76;
        list2 = list4;
        string72 = string74;
        string70 = string73;
        string68 = string71;
        var62_67 = var260_354;
        var63_68 = var261_358;
        string65 = string113;
        var67_72 = var266_369;
        var68_73 = var267_373;
        var69_74 = var268_377;
        var70_75 = var269_381;
        int bl192 = bl139;
        int bl193 = bl140;
        int bl194 = bl141;
        int bl195 = bl142;
        var81_90 = var281_399;
        string62 = string64;
        string60 = string63;
        var86_95 = var289_413;
        string56 = string58;
        spannableString2 = spannableString3;
        string52 = string54;
        f14 = f16;
        f11 = f15;
        f8 = f12;
        string49 = string51;
        int bl196 = bl153;
        int bl197 = bl154;
        int bl198 = bl155;
        var115_126 = var330_471;
        var116_127 = var331_475;
        var117_128 = var332_479;
        var118_129 = var333_483;
        var119_130 = var334_487;
        var120_131 = var335_491;
        var121_132 = var336_495;
        var122_133 = var337_499;
        string46 = string47;
        var126_137 = var343_511;
        var127_138 = var344_515;
        var128_139 = var345_519;
        var129_140 = var346_523;
        int bl199 = bl97;
        int n152 = n135;
        var132_145 = var348_528;
        var133_146 = var349_532;
        var134_147 = var350_536;
        var135_148 = var351_540;
        var136_149 = var352_544;
        var137_150 = var353_548;
        int bl200 = bl175;
        int bl201 = bl176;
        int bl202 = bl177;
        int bl203 = bl178;
        int bl204 = bl179;
        int bl205 = bl180;
        int bl206 = bl181;
        int bl207 = bl102;
        int n153 = n32;
        int n154 = n35;
        int n155 = n37;
        int n156 = n39;
        int n157 = n42;
        var151_177 = var361_559;
        var152_178 = var362_563;
        var153_179 = var363_567;
        var154_180 = var364_571;
        var155_181 = var365_575;
        var156_182 = var366_579;
        var157_183 = var367_583;
        bl98 = bl103;
        this((String)object12, string105, string104, string103, (Integer)object11, (HomeWidgetTypes)((Object)object13), n21, (boolean)var182_211, string102, string101, (ArrayList)var189_229, string106, (boolean)var191_231, string107, string99, (boolean)var194_237, string96, string95, (boolean)var202_248, string93, string92, string90, (boolean)var210_259, (boolean)var211_263, string88, string87, (boolean)var216_271, string85, (boolean)var219_277, string84, bl96, (boolean)bl189, n56 != 0, (boolean)var226_287, (boolean)var227_291, (boolean)var228_295, (boolean)var229_299, (boolean)var230_303, string81, string108, string109, string110, string111, (boolean)bl122, string112, (boolean)bl123, (boolean)bl99, (boolean)var240_316, (boolean)var241_320, (boolean)var242_324, (boolean)var243_328, (boolean)var244_332, string76, list4, list3, (boolean)var251_342, string74, string73, string71, string69, (boolean)var260_354, (boolean)var261_358, (boolean)var262_362, string113, string66, (boolean)var266_369, (boolean)var267_373, (boolean)var268_377, (boolean)var269_381, (boolean)var270_385, productFnlColorVariantData2, (boolean)bl138, string114, (boolean)bl139, (boolean)bl140, (boolean)bl141, (boolean)bl142, (boolean)bl143, string67, (boolean)var281_399, (boolean)var282_403, string64, string63, string61, (boolean)var289_413, (boolean)var290_417, string59, (boolean)var293_423, string58, string57, (boolean)var298_431, spannableString3, string55, (boolean)var303_439, string54, string115, n112 != 0, f16, f15, f12, string51, string50, (boolean)var318_457, l3, string116, (boolean)bl152, string117, (boolean)bl153, (boolean)bl154, (boolean)bl155, (boolean)bl101, string48, (boolean)var330_471, (boolean)var331_475, (boolean)var332_479, (boolean)var333_483, (boolean)var334_487, (boolean)var335_491, (boolean)var336_495, (boolean)var337_499, (boolean)var338_503, string47, d2, (boolean)var343_511, (boolean)var344_515, (boolean)var345_519, (boolean)var346_523, (boolean)bl97, n135 != 0, (boolean)var348_528, (boolean)var349_532, (boolean)var350_536, (boolean)var351_540, (boolean)var352_544, (boolean)var353_548, (boolean)bl175, (boolean)bl176, (boolean)bl177, (boolean)bl178, (boolean)bl179, (boolean)bl180, (boolean)bl181, (boolean)bl102, n32 != 0, n35 != 0, n37 != 0, n39 != 0, n42 != 0, (boolean)var361_559, (boolean)var362_563, (boolean)var363_567, (boolean)var364_571, (boolean)var365_575, (boolean)var366_579, (boolean)var367_583, (boolean)bl103);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ PlpProductUIModel copy$default(PlpProductUIModel plpProductUIModel, String string2, String string3, String string4, String string5, Integer n3, HomeWidgetTypes homeWidgetTypes, int n4, boolean bl2, String string6, String string7, ArrayList object, String object2, boolean bl3, String object3, String object4, boolean bl4, String object5, String object6, boolean bl5, String object7, String object8, String object9, boolean bl6, boolean bl7, String object10, String object11, boolean bl8, String object12, boolean bl9, String object13, Boolean object14, boolean bl10, boolean bl11, boolean bl12, boolean bl13, boolean bl14, boolean bl15, boolean bl16, String string8, String string9, String string10, String string11, String string12, boolean bl17, String string13, boolean bl18, boolean bl19, boolean bl20, boolean bl21, boolean bl22, boolean bl23, boolean bl24, String string14, List object15, List object16, boolean bl25, String object17, String object18, String object19, String object20, boolean bl26, boolean bl27, boolean bl28, String string15, String string16, boolean bl29, boolean bl30, boolean bl31, boolean bl32, boolean bl33, ProductFnlColorVariantData object21, boolean bl34, String object22, boolean bl35, boolean bl36, boolean bl37, boolean bl38, boolean bl39, String object23, boolean bl40, boolean bl41, String object24, String object25, String object26, boolean bl42, boolean bl43, String object27, boolean bl44, String object28, String object29, boolean bl45, SpannableString object30, String object31, boolean bl46, String object32, String string17, boolean bl47, Float object33, Float object34, Float object35, String object36, String object37, boolean bl48, long l2, String object38, boolean bl49, String object39, boolean bl50, boolean bl51, boolean bl52, boolean bl53, String object40, boolean bl54, boolean bl55, boolean bl56, boolean bl57, boolean bl58, boolean bl59, boolean bl60, boolean bl61, boolean bl62, String object41, Double object42, boolean bl63, boolean bl64, boolean bl65, boolean bl66, boolean bl67, boolean bl68, boolean bl69, boolean bl70, boolean bl71, boolean bl72, boolean bl73, boolean bl74, boolean bl75, boolean bl76, boolean bl77, boolean bl78, boolean bl79, boolean bl80, boolean bl81, boolean bl82, boolean bl83, boolean bl84, boolean bl85, boolean bl86, boolean bl87, boolean bl88, boolean bl89, boolean bl90, boolean bl91, boolean bl92, boolean bl93, boolean bl94, boolean bl95, int n7, int n8, int n10, int n14, int n15, Object object43) {
        void var183_278;
        void var157_248;
        void var156_246;
        void var155_244;
        void var154_242;
        void var153_240;
        void var152_238;
        void var151_236;
        void var150_234;
        void var149_232;
        void var148_230;
        void var147_228;
        void var146_226;
        void var145_224;
        void var144_222;
        void var143_220;
        void var142_218;
        void var141_216;
        void var140_214;
        void var139_212;
        void var138_210;
        void var137_208;
        void var136_206;
        void var135_204;
        void var134_202;
        void var133_200;
        void var132_198;
        void var131_196;
        void var130_194;
        void var129_192;
        void var128_190;
        void var127_188;
        void var126_186;
        void var125_184;
        Object object44;
        Object object45;
        void var122_180;
        void var121_178;
        void var120_176;
        void var119_174;
        void var118_172;
        void var117_170;
        void var116_168;
        void var115_166;
        void var114_164;
        Object object46;
        void var112_161;
        void var111_159;
        void var110_157;
        void var109_155;
        Object object47;
        void var107_152;
        Object object48;
        long l3;
        void var103_148;
        Object object49;
        Object object50;
        Object object51;
        Object object52;
        Object object53;
        void var97_141;
        String string18;
        Object object54;
        void var94_137;
        Object object55;
        Object object56;
        void var91_133;
        Object object57;
        Object object58;
        void var88_129;
        Object object59;
        void var86_126;
        void var85_124;
        Object object60;
        Object object61;
        Object object62;
        void var81_119;
        void var80_117;
        Object object63;
        void var78_114;
        void var77_112;
        void var76_110;
        void var75_108;
        void var74_106;
        Object object64;
        void var72_103;
        Object object65;
        void var70_100;
        void var69_98;
        void var68_96;
        void var67_94;
        void var66_92;
        String string19;
        String string20;
        void var63_88;
        void var62_86;
        void var61_84;
        Object object66;
        Object object67;
        Object object68;
        Object object69;
        void var56_78;
        Object object70;
        Object object71;
        String string21;
        void var52_73;
        void var51_71;
        void var50_69;
        void var49_67;
        void var48_65;
        void var47_63;
        void var46_61;
        String string22;
        void var44_58;
        String string23;
        String string24;
        String string25;
        String string26;
        String string27;
        void var38_51;
        void var37_49;
        void var36_47;
        void var35_45;
        void var34_43;
        void var33_41;
        void var32_39;
        Object object72;
        Object object73;
        void var29_35;
        Object object74;
        void var27_32;
        Object object75;
        Object object76;
        void var24_28;
        void var23_26;
        Object object77;
        Object object78;
        Object object79;
        void var19_21;
        Object object80;
        Object object81;
        void var16_17;
        Object object82;
        Object object83;
        void var162_254;
        void var161_253;
        void var160_252;
        void var159_251;
        void var158_250;
        PlpProductUIModel plpProductUIModel2 = plpProductUIModel;
        int bl96 = var158_250;
        int bl97 = var159_251;
        int bl98 = var160_252;
        int bl99 = var161_253;
        int bl100 = var162_254;
        int n16 = var158_250 & 1;
        String string28 = n16 != 0 ? plpProductUIModel.brandName : string2;
        int n17 = bl96 & 2;
        String string29 = n17 != 0 ? plpProductUIModel2.productName : string3;
        int n18 = bl96 & 4;
        String string30 = n18 != 0 ? plpProductUIModel2.productCode : string4;
        int n19 = bl96 & 8;
        String string31 = n19 != 0 ? plpProductUIModel2.productColorCode : string5;
        int n20 = bl96 & 0x10;
        Integer n21 = n20 != 0 ? plpProductUIModel2.viewTypeWishlist : n3;
        int n22 = bl96 & 0x20;
        HomeWidgetTypes homeWidgetTypes2 = n22 != 0 ? plpProductUIModel2.productType : homeWidgetTypes;
        int n24 = bl96 & 0x40;
        n24 = n24 != 0 ? plpProductUIModel2.viewHolderPos : n4;
        int n25 = bl96 & 0x80;
        if (n25 != 0) {
            boolean bl101 = plpProductUIModel2.isAjiogramStoreId;
        } else {
            boolean bl102 = bl2;
        }
        int n26 = bl96 & 0x100;
        String string32 = n26 != 0 ? plpProductUIModel2.productImageUrl : string6;
        boolean bl103 = bl96 & 0x200;
        Object object84 = bl103 ? plpProductUIModel2.productImageContentDescription : string7;
        string7 = object84;
        bl103 = bl96 & 0x400;
        object84 = bl103 ? plpProductUIModel2.extraImagesUrlList : object;
        object = object84;
        bl103 = bl96 & 0x800;
        object84 = bl103 ? plpProductUIModel2.productImgPlaceholerDescription : object2;
        object2 = object84;
        bl103 = bl96 & 0x1000;
        bl103 = bl103 ? (boolean)plpProductUIModel2.isSimilarProductEnabled : (boolean)bl3;
        boolean bl104 = bl103;
        bl103 = bl96 & 0x2000;
        object84 = bl103 ? plpProductUIModel2.similarProductType : object83;
        object83 = object84;
        bl103 = bl96 & 0x4000;
        object84 = bl103 ? plpProductUIModel2.similarIconContentDescription : object82;
        int n27 = 32768;
        int n28 = bl96 & n27;
        object82 = object84;
        bl103 = n28 != 0 ? (boolean)plpProductUIModel2.isProductWishlisted : var16_17;
        n28 = 65536;
        int n29 = bl96 & n28;
        boolean bl105 = bl103;
        object84 = n29 != 0 ? plpProductUIModel2.wishlistCountShortText : object81;
        n29 = 131072;
        int n30 = bl96 & n29;
        object81 = object84;
        object84 = n30 != 0 ? plpProductUIModel2.wishlistCountLongText : object80;
        n30 = 262144;
        int n32 = bl96 & n30;
        object80 = object84;
        bl103 = n32 != 0 ? (boolean)plpProductUIModel2.isWishlistCountAvailable : var19_21;
        n32 = 524288;
        int n34 = bl96 & n32;
        boolean bl106 = bl103;
        object84 = n34 != 0 ? plpProductUIModel2.closetButtonContentDescription : object79;
        n34 = 0x100000;
        int n35 = bl96 & n34;
        object79 = object84;
        object84 = n35 != 0 ? plpProductUIModel2.closetAddedButtonContentDescription : object78;
        n35 = 0x200000;
        int n36 = bl96 & n35;
        object78 = object84;
        object84 = n36 != 0 ? plpProductUIModel2.closetSimilarContentDescription : object77;
        n36 = bl96 & 0x400000;
        object77 = object84;
        bl103 = n36 != 0 ? (boolean)plpProductUIModel2.showProductTags : var23_26;
        n36 = bl96 & 0x800000;
        boolean bl107 = bl103;
        bl103 = n36 != 0 ? (boolean)plpProductUIModel2.showAdTag : var24_28;
        n36 = bl96 & 0x1000000;
        boolean bl108 = bl103;
        object84 = n36 != 0 ? plpProductUIModel2.productTagValue : object76;
        n36 = bl96 & 0x2000000;
        object76 = object84;
        object84 = n36 != 0 ? plpProductUIModel2.productTagViewContentDescription : object75;
        n36 = bl96 & 0x4000000;
        object75 = object84;
        bl103 = n36 != 0 ? (boolean)plpProductUIModel2.isPlpUrgencyTagEnabled : var27_32;
        n36 = bl96 & 0x8000000;
        boolean bl109 = bl103;
        object84 = n36 != 0 ? plpProductUIModel2.urgencyTagValue : object74;
        n36 = bl96 & 0x10000000;
        object74 = object84;
        bl103 = n36 != 0 ? (boolean)plpProductUIModel2.isPlpBargainUrgencyTagEnabled : var29_35;
        n36 = bl96 & 0x20000000;
        boolean bl110 = bl103;
        object84 = n36 != 0 ? plpProductUIModel2.bargainUrgencyTagValue : object73;
        n36 = bl96 & 0x40000000;
        object73 = object84;
        object84 = n36 != 0 ? plpProductUIModel2.isAjiogramProduct : object72;
        n36 = -1 << -1;
        bl96 = (bl96 &= n36) ? (int)plpProductUIModel2.showSizeLayout : var32_39;
        n36 = bl97 & 1;
        int bl111 = bl96;
        bl96 = n36 != 0 ? (int)plpProductUIModel2.showSizeVariants : var33_41;
        n36 = bl97 & 2;
        int bl112 = bl96;
        bl96 = n36 != 0 ? (int)plpProductUIModel2.showSizeFirstView : var34_43;
        n36 = bl97 & 4;
        int bl113 = bl96;
        bl96 = n36 != 0 ? (int)plpProductUIModel2.showSizeSecondView : var35_45;
        n36 = bl97 & 8;
        int bl114 = bl96;
        bl96 = n36 != 0 ? (int)plpProductUIModel2.showSizeThirdView : var36_47;
        n36 = bl97 & 0x10;
        int bl115 = bl96;
        bl96 = n36 != 0 ? (int)plpProductUIModel2.showSizeFourthView : var37_49;
        n36 = bl97 & 0x20;
        int bl116 = bl96;
        bl96 = n36 != 0 ? (int)plpProductUIModel2.showSizeCount : var38_51;
        n36 = bl97 & 0x40;
        int bl117 = bl96;
        Object object85 = n36 != 0 ? plpProductUIModel2.sizeFirstViewText : string27;
        string27 = object85;
        bl96 = bl97 & 0x80;
        object85 = bl96 ? plpProductUIModel2.sizeSecondViewText : string26;
        string26 = object85;
        bl96 = bl97 & 0x100;
        object85 = bl96 ? plpProductUIModel2.sizeThirdViewText : string25;
        string25 = object85;
        bl96 = bl97 & 0x200;
        object85 = bl96 ? plpProductUIModel2.sizeFourthViewText : string24;
        string24 = object85;
        bl96 = bl97 & 0x400;
        object85 = bl96 ? plpProductUIModel2.sizeCountText : string23;
        string23 = object85;
        bl96 = bl97 & 0x800;
        bl96 = bl96 ? (int)plpProductUIModel2.showSizeView : var44_58;
        int bl118 = bl96;
        bl96 = bl97 & 0x1000;
        object85 = bl96 ? plpProductUIModel2.sizeContentDescription : string22;
        string22 = object85;
        bl96 = bl97 & 0x2000;
        bl96 = bl96 ? (int)plpProductUIModel2.showAddedToCart : var46_61;
        int bl119 = bl96;
        bl96 = bl97 & 0x4000;
        bl96 = bl96 ? (int)plpProductUIModel2.enableAddtoBag : var47_63;
        n36 = bl97 & n27;
        int bl120 = bl96;
        bl96 = n36 != 0 ? (int)plpProductUIModel2.isComingSoonEnable : var48_65;
        n36 = bl97 & n28;
        int bl121 = bl96;
        bl96 = n36 != 0 ? (int)plpProductUIModel2.isAfterCartLuxEnabled : var49_67;
        n36 = bl97 & n29;
        int bl122 = bl96;
        bl96 = n36 != 0 ? (int)plpProductUIModel2.isSimilarOOSWishListAjioANDOOSBagEnabled : var50_69;
        n36 = bl97 & n30;
        int bl123 = bl96;
        bl96 = n36 != 0 ? (int)plpProductUIModel2.isSimilarOOSWishListLuxeANDOOSBagEnabled : var51_71;
        n36 = bl97 & n32;
        int bl124 = bl96;
        bl96 = n36 != 0 ? (int)plpProductUIModel2.isHeaderNotEmpty : var52_73;
        n36 = bl97 & n34;
        int bl125 = bl96;
        object85 = n36 != 0 ? plpProductUIModel2.headerText : string21;
        n36 = bl97 & n35;
        string21 = object85;
        object85 = n36 != 0 ? plpProductUIModel2.variantOptions : object71;
        n36 = bl97 & 0x400000;
        object71 = object85;
        object85 = n36 != 0 ? plpProductUIModel2.productOptionVariants : object70;
        n36 = bl97 & 0x800000;
        object70 = object85;
        bl96 = n36 != 0 ? (int)plpProductUIModel2.populateSelectSizeLabel : var56_78;
        n36 = bl97 & 0x1000000;
        int bl126 = bl96;
        object85 = n36 != 0 ? plpProductUIModel2.deleteWishlistContentDescription : object69;
        n36 = bl97 & 0x2000000;
        object69 = object85;
        object85 = n36 != 0 ? plpProductUIModel2.addToBagContentDescription : object68;
        n36 = bl97 & 0x4000000;
        object68 = object85;
        object85 = n36 != 0 ? plpProductUIModel2.oosSimilarContentDescription : object67;
        n36 = bl97 & 0x8000000;
        object67 = object85;
        object85 = n36 != 0 ? plpProductUIModel2.closetAddBagContentDescription : object66;
        n36 = bl97 & 0x10000000;
        object66 = object85;
        bl96 = n36 != 0 ? (int)plpProductUIModel2.isImageLoaded : var61_84;
        n36 = bl97 & 0x20000000;
        int bl127 = bl96;
        bl96 = n36 != 0 ? (int)plpProductUIModel2.isLuxeCartPriceEnable : var62_86;
        n36 = bl97 & 0x40000000;
        int bl128 = bl96;
        bl96 = n36 != 0 ? (int)plpProductUIModel2.isAllOutOfStock : var63_88;
        n36 = -1 << -1;
        Object object86 = (bl97 &= n36) ? plpProductUIModel2.closetAddBagText : string20;
        n36 = bl98 & 1;
        string20 = object86;
        object86 = n36 != 0 ? plpProductUIModel2.addedToCartText : string19;
        n36 = bl98 & 2;
        string19 = object86;
        bl97 = n36 != 0 ? (int)plpProductUIModel2.checkIfTalkbackServiceEnabled : var66_92;
        n36 = bl98 & 4;
        int bl129 = bl97;
        bl97 = n36 != 0 ? (int)plpProductUIModel2.isSimilarOOSWishlistEnabled : var67_94;
        n36 = bl98 & 8;
        int bl130 = bl97;
        bl97 = n36 != 0 ? (int)plpProductUIModel2.isSelectionMode : var68_96;
        n36 = bl98 & 0x10;
        int bl131 = bl97;
        bl97 = n36 != 0 ? (int)plpProductUIModel2.isPositionSelected : var69_98;
        n36 = bl98 & 0x20;
        int bl132 = bl97;
        bl97 = n36 != 0 ? (int)plpProductUIModel2.isSimilarOOSWishlistLuxeEnabled : var70_100;
        n36 = bl98 & 0x40;
        int bl133 = bl97;
        object86 = n36 != 0 ? plpProductUIModel2.fnlColorVariantData : object65;
        object65 = object86;
        bl97 = bl98 & 0x80;
        bl97 = bl97 ? (int)plpProductUIModel2.isAllPromotions : var72_103;
        int bl134 = bl97;
        bl97 = bl98 & 0x100;
        object86 = bl97 ? plpProductUIModel2.promoContentDescription : object64;
        object64 = object86;
        bl97 = bl98 & 0x200;
        bl97 = bl97 ? (int)plpProductUIModel2.cardUi : var74_106;
        int bl135 = bl97;
        bl97 = bl98 & 0x400;
        bl97 = bl97 ? (int)plpProductUIModel2.isFromHomeProductWidget : var75_108;
        int bl136 = bl97;
        bl97 = bl98 & 0x800;
        bl97 = bl97 ? (int)plpProductUIModel2.isPriceDropReqd : var76_110;
        int bl137 = bl97;
        bl97 = bl98 & 0x1000;
        bl97 = bl97 ? (int)plpProductUIModel2.recentlyViewedProdPrice : var77_112;
        int bl138 = bl97;
        bl97 = bl98 & 0x2000;
        bl97 = bl97 ? (int)plpProductUIModel2.priceDropValue : var78_114;
        int bl139 = bl97;
        bl97 = bl98 & 0x4000;
        object86 = bl97 ? plpProductUIModel2.priceDrop : object63;
        n36 = bl98 & n27;
        object63 = object86;
        bl97 = n36 != 0 ? (int)plpProductUIModel2.pdpInfoProviderLuxeEnable : var80_117;
        n36 = bl98 & n28;
        int bl140 = bl97;
        bl97 = n36 != 0 ? (int)plpProductUIModel2.shouldShowProductDescription : var81_119;
        n36 = bl98 & n29;
        int bl141 = bl97;
        object86 = n36 != 0 ? plpProductUIModel2.promoImageurl : object62;
        n36 = bl98 & n30;
        object62 = object86;
        object86 = n36 != 0 ? plpProductUIModel2.accBannerDesc : object61;
        n36 = bl98 & n32;
        object61 = object86;
        object86 = n36 != 0 ? plpProductUIModel2.colorGroup : object60;
        n36 = bl98 & n34;
        object60 = object86;
        bl97 = n36 != 0 ? (int)plpProductUIModel2.showOODEnable : var85_124;
        n36 = bl98 & n35;
        int bl142 = bl97;
        bl97 = n36 != 0 ? (int)plpProductUIModel2.isPrioritydeliveryFeatureEnable : var86_126;
        n36 = bl98 & 0x400000;
        int bl143 = bl97;
        object86 = n36 != 0 ? plpProductUIModel2.deliverySlaTag : object59;
        n36 = bl98 & 0x800000;
        object59 = object86;
        bl97 = n36 != 0 ? (int)plpProductUIModel2.showFinalPrice : var88_129;
        n36 = bl98 & 0x1000000;
        int bl144 = bl97;
        object86 = n36 != 0 ? plpProductUIModel2.finalPriceValue : object58;
        n36 = bl98 & 0x2000000;
        object58 = object86;
        object86 = n36 != 0 ? plpProductUIModel2.finalPriceContentDescription : object57;
        n36 = bl98 & 0x4000000;
        object57 = object86;
        bl97 = n36 != 0 ? (int)plpProductUIModel2.showMrpPrice : var91_133;
        n36 = bl98 & 0x8000000;
        int bl145 = bl97;
        object86 = n36 != 0 ? plpProductUIModel2.mrpPriceValue : object56;
        n36 = bl98 & 0x10000000;
        object56 = object86;
        object86 = n36 != 0 ? plpProductUIModel2.mrpPriceContentDescription : object55;
        n36 = bl98 & 0x20000000;
        object55 = object86;
        bl97 = n36 != 0 ? (int)plpProductUIModel2.showDiscountPrice : var94_137;
        n36 = bl98 & 0x40000000;
        int bl146 = bl97;
        object86 = n36 != 0 ? plpProductUIModel2.discountPriceValue : object54;
        n36 = -1 << -1;
        Object object87 = (bl98 &= n36) ? plpProductUIModel2.discountPriceContentDescription : string18;
        n36 = bl99 & 1;
        string18 = object87;
        bl98 = n36 != 0 ? (int)plpProductUIModel2.setDiscountColor : var97_141;
        n36 = bl99 & 2;
        int bl147 = bl98;
        object87 = n36 != 0 ? plpProductUIModel2.wasPriceValue : object53;
        n36 = bl99 & 4;
        object53 = object87;
        object87 = n36 != 0 ? plpProductUIModel2.priceValue : object52;
        n36 = bl99 & 8;
        object52 = object87;
        object87 = n36 != 0 ? plpProductUIModel2.bestPriceValue : object51;
        n36 = bl99 & 0x10;
        object51 = object87;
        object87 = n36 != 0 ? plpProductUIModel2.discountPercentValue : object50;
        n36 = bl99 & 0x20;
        object50 = object87;
        object87 = n36 != 0 ? plpProductUIModel2.offerPrice : object49;
        n36 = bl99 & 0x40;
        object49 = object87;
        bl98 = n36 != 0 ? (int)plpProductUIModel2.isDodEnabled : var103_148;
        int bl148 = bl98;
        bl98 = bl99 & 0x80;
        object54 = object86;
        long l4 = bl98 ? plpProductUIModel2.dodEndTime : l3;
        l3 = l4;
        bl97 = bl99 & 0x100;
        object86 = bl97 ? plpProductUIModel2.offerPriceValue : object48;
        bl98 = bl99 & 0x200;
        bl98 = bl98 ? (int)plpProductUIModel2.showOfferPrice : var107_152;
        int bl149 = bl98;
        bl98 = bl99 & 0x400;
        object87 = bl98 ? plpProductUIModel2.offerPriceContentDescription : object47;
        object47 = object87;
        bl98 = bl99 & 0x800;
        bl98 = bl98 ? (int)plpProductUIModel2.setOfferPriceDrawable : var109_155;
        int bl150 = bl98;
        bl98 = bl99 & 0x1000;
        bl98 = bl98 ? (int)plpProductUIModel2.setOfferPrice : var110_157;
        int bl151 = bl98;
        bl98 = bl99 & 0x2000;
        bl98 = bl98 ? (int)plpProductUIModel2.isGwpEnabled : var111_159;
        int bl152 = bl98;
        bl98 = bl99 & 0x4000;
        bl98 = bl98 ? (int)plpProductUIModel2.isGiftAvailable : var112_161;
        n36 = bl99 & n27;
        int bl153 = bl98;
        object87 = n36 != 0 ? plpProductUIModel2.gwpFreebiesOneText : object46;
        n36 = bl99 & n28;
        object46 = object87;
        bl98 = n36 != 0 ? (int)plpProductUIModel2.isLuxeEnabled : var114_164;
        n36 = bl99 & n29;
        int bl154 = bl98;
        bl98 = n36 != 0 ? (int)plpProductUIModel2.isGWPFeatureEnabledAjioLuxe : var115_166;
        n36 = bl99 & n30;
        int bl155 = bl98;
        bl98 = n36 != 0 ? (int)plpProductUIModel2.isPreSalePlp : var116_168;
        n36 = bl99 & n32;
        int bl156 = bl98;
        bl98 = n36 != 0 ? (int)plpProductUIModel2.isSaleWishlist : var117_170;
        n36 = bl99 & n34;
        int bl157 = bl98;
        bl98 = n36 != 0 ? (int)plpProductUIModel2.enableSaleContainer : var118_172;
        n36 = bl99 & n35;
        int bl158 = bl98;
        bl98 = n36 != 0 ? (int)plpProductUIModel2.isLuxeAfercartAndLuxeEnable : var119_174;
        n36 = bl99 & 0x400000;
        int bl159 = bl98;
        bl98 = n36 != 0 ? (int)plpProductUIModel2.isSaleContainerSpaceRetained : var120_176;
        n36 = bl99 & 0x800000;
        int bl160 = bl98;
        bl98 = n36 != 0 ? (int)plpProductUIModel2.isRatingEnabledPlp : var121_178;
        n36 = bl99 & 0x1000000;
        int bl161 = bl98;
        bl98 = n36 != 0 ? (int)plpProductUIModel2.isRatingStarDisplayEnabled : var122_180;
        n36 = bl99 & 0x2000000;
        int bl162 = bl98;
        object87 = n36 != 0 ? plpProductUIModel2.productRatingCount : object45;
        n36 = bl99 & 0x4000000;
        object45 = object87;
        object87 = n36 != 0 ? plpProductUIModel2.averageRating : object44;
        n36 = bl99 & 0x8000000;
        object44 = object87;
        bl98 = n36 != 0 ? (int)plpProductUIModel2.showAjiogramTag : var125_184;
        n36 = bl99 & 0x10000000;
        int bl163 = bl98;
        bl98 = n36 != 0 ? (int)plpProductUIModel2.showPlpGrid : var126_186;
        n36 = bl99 & 0x20000000;
        int bl164 = bl98;
        bl98 = n36 != 0 ? (int)plpProductUIModel2.productTextWrap : var127_188;
        n36 = bl99 & 0x40000000;
        int bl165 = bl98;
        bl98 = n36 != 0 ? (int)plpProductUIModel2.enableAddtoCart : var128_190;
        n36 = -1 << -1;
        bl99 = (bl99 &= n36) ? (int)plpProductUIModel2.enableCartClosetSizeLayout : var129_192;
        n36 = bl100 & 1;
        int bl166 = bl99;
        bl99 = n36 != 0 ? (int)plpProductUIModel2.enableCartClosetSelectSize : var130_194;
        n36 = bl100 & 2;
        int bl167 = bl99;
        bl99 = n36 != 0 ? (int)plpProductUIModel2.enabledeleteImg : var131_196;
        n36 = bl100 & 4;
        int bl168 = bl99;
        bl99 = n36 != 0 ? (int)plpProductUIModel2.enableSimilarCartClosetCLick : var132_198;
        n36 = bl100 & 8;
        int bl169 = bl99;
        bl99 = n36 != 0 ? (int)plpProductUIModel2.enableAddToBagCartClosetClick : var133_200;
        n36 = bl100 & 0x10;
        int bl170 = bl99;
        bl99 = n36 != 0 ? (int)plpProductUIModel2.enableDeleteOssContainer : var134_202;
        n36 = bl100 & 0x20;
        int bl171 = bl99;
        bl99 = n36 != 0 ? (int)plpProductUIModel2.enableOOSTV : var135_204;
        n36 = bl100 & 0x40;
        int bl172 = bl99;
        bl99 = n36 != 0 ? (int)plpProductUIModel2.enableOOSBG : var136_206;
        int bl173 = bl99;
        bl99 = bl100 & 0x80;
        bl99 = bl99 ? (int)plpProductUIModel2.enableOutOfStock : var137_208;
        int bl174 = bl99;
        bl99 = bl100 & 0x100;
        bl99 = bl99 ? (int)plpProductUIModel2.enableAddedToBag : var138_210;
        int bl175 = bl99;
        bl99 = bl100 & 0x200;
        bl99 = bl99 ? (int)plpProductUIModel2.enableCartClosetAddToBag : var139_212;
        int bl176 = bl99;
        bl99 = bl100 & 0x400;
        bl99 = bl99 ? (int)plpProductUIModel2.closetSelectionEnable : var140_214;
        int bl177 = bl99;
        bl99 = bl100 & 0x800;
        bl99 = bl99 ? (int)plpProductUIModel2.isRecentlyViewLayoutChanges : var141_216;
        int bl178 = bl99;
        bl99 = bl100 & 0x1000;
        bl99 = bl99 ? (int)plpProductUIModel2.isPromoImageAvailable : var142_218;
        int bl179 = bl99;
        bl99 = bl100 & 0x2000;
        bl99 = bl99 ? (int)plpProductUIModel2.isPriceValueChanges : var143_220;
        int bl180 = bl99;
        bl99 = bl100 & 0x4000;
        bl99 = bl99 ? (int)plpProductUIModel2.enableFreebie : var144_222;
        n27 = bl100 & n27;
        int bl181 = bl99;
        bl99 = n27 != 0 ? (int)plpProductUIModel2.enableWishlistView : var145_224;
        n27 = bl100 & n28;
        int bl182 = bl99;
        bl99 = n27 != 0 ? (int)plpProductUIModel2.enableComingSoonProducts : var146_226;
        n27 = bl100 & n29;
        int bl183 = bl99;
        bl99 = n27 != 0 ? (int)plpProductUIModel2.sellingFastTag : var147_228;
        n27 = bl100 & n30;
        int bl184 = bl99;
        bl99 = n27 != 0 ? (int)plpProductUIModel2.layoutWidthChangesRequired : var148_230;
        n27 = bl100 & n32;
        int bl185 = bl99;
        bl99 = n27 != 0 ? (int)plpProductUIModel2.enablebackground : var149_232;
        n27 = bl100 & n34;
        int bl186 = bl99;
        bl99 = n27 != 0 ? (int)plpProductUIModel2.enableRatingView : var150_234;
        n27 = bl100 & n35;
        int bl187 = bl99;
        bl99 = n27 != 0 ? (int)plpProductUIModel2.cartClosetClickListners : var151_236;
        n27 = bl100 & 0x400000;
        int bl188 = bl99;
        bl99 = n27 != 0 ? (int)plpProductUIModel2.cartClickListners : var152_238;
        n27 = bl100 & 0x800000;
        int bl189 = bl99;
        bl99 = n27 != 0 ? (int)plpProductUIModel2.luxeCartClickListners : var153_240;
        n27 = bl100 & 0x1000000;
        int bl190 = bl99;
        bl99 = n27 != 0 ? (int)plpProductUIModel2.recentViewclickListners : var154_242;
        n27 = bl100 & 0x2000000;
        int bl191 = bl99;
        bl99 = n27 != 0 ? (int)plpProductUIModel2.newProductViewClickListeners : var155_244;
        n27 = bl100 & 0x4000000;
        int bl192 = bl99;
        bl99 = n27 != 0 ? (int)plpProductUIModel2.productClicklisteners : var156_246;
        n27 = 0x8000000;
        bl100 = (bl100 &= n27) ? (int)plpProductUIModel2.isRecentlyWidgetEnable : var157_248;
        string2 = string28;
        string3 = string29;
        string4 = string30;
        string5 = string31;
        n3 = n21;
        homeWidgetTypes = homeWidgetTypes2;
        n4 = n24;
        bl2 = var183_278;
        string6 = string32;
        object72 = object84;
        int bl193 = bl96;
        object48 = object86;
        int bl194 = bl98;
        int bl195 = bl99;
        int bl196 = bl100;
        return plpProductUIModel.copy(string28, string29, string30, string31, n21, homeWidgetTypes2, n24, (boolean)var183_278, string32, string7, (ArrayList)object, (String)object2, bl104, (String)object83, (String)object82, bl105, (String)object81, (String)object80, bl106, (String)object79, (String)object78, (String)object77, bl107, bl108, (String)object76, (String)object75, bl109, (String)object74, bl110, (String)object73, (Boolean)object84, (boolean)bl111, (boolean)bl112, (boolean)bl113, (boolean)bl114, (boolean)bl115, (boolean)bl116, (boolean)bl117, string27, string26, string25, string24, string23, (boolean)bl118, string22, (boolean)bl119, (boolean)bl120, (boolean)bl121, (boolean)bl122, (boolean)bl123, (boolean)bl124, (boolean)bl125, string21, (List)object71, (List)object70, (boolean)bl126, (String)object69, (String)object68, (String)object67, (String)object66, (boolean)bl127, (boolean)bl128, (boolean)bl96, string20, string19, (boolean)bl129, (boolean)bl130, (boolean)bl131, (boolean)bl132, (boolean)bl133, (ProductFnlColorVariantData)object65, (boolean)bl134, (String)object64, (boolean)bl135, (boolean)bl136, (boolean)bl137, (boolean)bl138, (boolean)bl139, (String)object63, (boolean)bl140, (boolean)bl141, (String)object62, (String)object61, (String)object60, (boolean)bl142, (boolean)bl143, (String)object59, (boolean)bl144, (String)object58, (String)object57, (boolean)bl145, (SpannableString)object56, (String)object55, (boolean)bl146, (String)object54, string18, (boolean)bl147, (Float)object53, (Float)object52, (Float)object51, (String)object50, (String)object49, (boolean)bl148, l3, (String)object86, (boolean)bl149, (String)object47, (boolean)bl150, (boolean)bl151, (boolean)bl152, (boolean)bl153, (String)object46, (boolean)bl154, (boolean)bl155, (boolean)bl156, (boolean)bl157, (boolean)bl158, (boolean)bl159, (boolean)bl160, (boolean)bl161, (boolean)bl162, (String)object45, (Double)object44, (boolean)bl163, (boolean)bl164, (boolean)bl165, (boolean)bl98, (boolean)bl166, (boolean)bl167, (boolean)bl168, (boolean)bl169, (boolean)bl170, (boolean)bl171, (boolean)bl172, (boolean)bl173, (boolean)bl174, (boolean)bl175, (boolean)bl176, (boolean)bl177, (boolean)bl178, (boolean)bl179, (boolean)bl180, (boolean)bl181, (boolean)bl182, (boolean)bl183, (boolean)bl184, (boolean)bl185, (boolean)bl186, (boolean)bl187, (boolean)bl188, (boolean)bl189, (boolean)bl190, (boolean)bl191, (boolean)bl192, (boolean)bl99, (boolean)bl100);
    }

    public final String component1() {
        return this.brandName;
    }

    public final String component10() {
        return this.productImageContentDescription;
    }

    public final Float component100() {
        return this.bestPriceValue;
    }

    public final String component101() {
        return this.discountPercentValue;
    }

    public final String component102() {
        return this.offerPrice;
    }

    public final boolean component103() {
        return this.isDodEnabled;
    }

    public final long component104() {
        return this.dodEndTime;
    }

    public final String component105() {
        return this.offerPriceValue;
    }

    public final boolean component106() {
        return this.showOfferPrice;
    }

    public final String component107() {
        return this.offerPriceContentDescription;
    }

    public final boolean component108() {
        return this.setOfferPriceDrawable;
    }

    public final boolean component109() {
        return this.setOfferPrice;
    }

    public final ArrayList component11() {
        return this.extraImagesUrlList;
    }

    public final boolean component110() {
        return this.isGwpEnabled;
    }

    public final boolean component111() {
        return this.isGiftAvailable;
    }

    public final String component112() {
        return this.gwpFreebiesOneText;
    }

    public final boolean component113() {
        return this.isLuxeEnabled;
    }

    public final boolean component114() {
        return this.isGWPFeatureEnabledAjioLuxe;
    }

    public final boolean component115() {
        return this.isPreSalePlp;
    }

    public final boolean component116() {
        return this.isSaleWishlist;
    }

    public final boolean component117() {
        return this.enableSaleContainer;
    }

    public final boolean component118() {
        return this.isLuxeAfercartAndLuxeEnable;
    }

    public final boolean component119() {
        return this.isSaleContainerSpaceRetained;
    }

    public final String component12() {
        return this.productImgPlaceholerDescription;
    }

    public final boolean component120() {
        return this.isRatingEnabledPlp;
    }

    public final boolean component121() {
        return this.isRatingStarDisplayEnabled;
    }

    public final String component122() {
        return this.productRatingCount;
    }

    public final Double component123() {
        return this.averageRating;
    }

    public final boolean component124() {
        return this.showAjiogramTag;
    }

    public final boolean component125() {
        return this.showPlpGrid;
    }

    public final boolean component126() {
        return this.productTextWrap;
    }

    public final boolean component127() {
        return this.enableAddtoCart;
    }

    public final boolean component128() {
        return this.enableCartClosetSizeLayout;
    }

    public final boolean component129() {
        return this.enableCartClosetSelectSize;
    }

    public final boolean component13() {
        return this.isSimilarProductEnabled;
    }

    public final boolean component130() {
        return this.enabledeleteImg;
    }

    public final boolean component131() {
        return this.enableSimilarCartClosetCLick;
    }

    public final boolean component132() {
        return this.enableAddToBagCartClosetClick;
    }

    public final boolean component133() {
        return this.enableDeleteOssContainer;
    }

    public final boolean component134() {
        return this.enableOOSTV;
    }

    public final boolean component135() {
        return this.enableOOSBG;
    }

    public final boolean component136() {
        return this.enableOutOfStock;
    }

    public final boolean component137() {
        return this.enableAddedToBag;
    }

    public final boolean component138() {
        return this.enableCartClosetAddToBag;
    }

    public final boolean component139() {
        return this.closetSelectionEnable;
    }

    public final String component14() {
        return this.similarProductType;
    }

    public final boolean component140() {
        return this.isRecentlyViewLayoutChanges;
    }

    public final boolean component141() {
        return this.isPromoImageAvailable;
    }

    public final boolean component142() {
        return this.isPriceValueChanges;
    }

    public final boolean component143() {
        return this.enableFreebie;
    }

    public final boolean component144() {
        return this.enableWishlistView;
    }

    public final boolean component145() {
        return this.enableComingSoonProducts;
    }

    public final boolean component146() {
        return this.sellingFastTag;
    }

    public final boolean component147() {
        return this.layoutWidthChangesRequired;
    }

    public final boolean component148() {
        return this.enablebackground;
    }

    public final boolean component149() {
        return this.enableRatingView;
    }

    public final String component15() {
        return this.similarIconContentDescription;
    }

    public final boolean component150() {
        return this.cartClosetClickListners;
    }

    public final boolean component151() {
        return this.cartClickListners;
    }

    public final boolean component152() {
        return this.luxeCartClickListners;
    }

    public final boolean component153() {
        return this.recentViewclickListners;
    }

    public final boolean component154() {
        return this.newProductViewClickListeners;
    }

    public final boolean component155() {
        return this.productClicklisteners;
    }

    public final boolean component156() {
        return this.isRecentlyWidgetEnable;
    }

    public final boolean component16() {
        return this.isProductWishlisted;
    }

    public final String component17() {
        return this.wishlistCountShortText;
    }

    public final String component18() {
        return this.wishlistCountLongText;
    }

    public final boolean component19() {
        return this.isWishlistCountAvailable;
    }

    public final String component2() {
        return this.productName;
    }

    public final String component20() {
        return this.closetButtonContentDescription;
    }

    public final String component21() {
        return this.closetAddedButtonContentDescription;
    }

    public final String component22() {
        return this.closetSimilarContentDescription;
    }

    public final boolean component23() {
        return this.showProductTags;
    }

    public final boolean component24() {
        return this.showAdTag;
    }

    public final String component25() {
        return this.productTagValue;
    }

    public final String component26() {
        return this.productTagViewContentDescription;
    }

    public final boolean component27() {
        return this.isPlpUrgencyTagEnabled;
    }

    public final String component28() {
        return this.urgencyTagValue;
    }

    public final boolean component29() {
        return this.isPlpBargainUrgencyTagEnabled;
    }

    public final String component3() {
        return this.productCode;
    }

    public final String component30() {
        return this.bargainUrgencyTagValue;
    }

    public final Boolean component31() {
        return this.isAjiogramProduct;
    }

    public final boolean component32() {
        return this.showSizeLayout;
    }

    public final boolean component33() {
        return this.showSizeVariants;
    }

    public final boolean component34() {
        return this.showSizeFirstView;
    }

    public final boolean component35() {
        return this.showSizeSecondView;
    }

    public final boolean component36() {
        return this.showSizeThirdView;
    }

    public final boolean component37() {
        return this.showSizeFourthView;
    }

    public final boolean component38() {
        return this.showSizeCount;
    }

    public final String component39() {
        return this.sizeFirstViewText;
    }

    public final String component4() {
        return this.productColorCode;
    }

    public final String component40() {
        return this.sizeSecondViewText;
    }

    public final String component41() {
        return this.sizeThirdViewText;
    }

    public final String component42() {
        return this.sizeFourthViewText;
    }

    public final String component43() {
        return this.sizeCountText;
    }

    public final boolean component44() {
        return this.showSizeView;
    }

    public final String component45() {
        return this.sizeContentDescription;
    }

    public final boolean component46() {
        return this.showAddedToCart;
    }

    public final boolean component47() {
        return this.enableAddtoBag;
    }

    public final boolean component48() {
        return this.isComingSoonEnable;
    }

    public final boolean component49() {
        return this.isAfterCartLuxEnabled;
    }

    public final Integer component5() {
        return this.viewTypeWishlist;
    }

    public final boolean component50() {
        return this.isSimilarOOSWishListAjioANDOOSBagEnabled;
    }

    public final boolean component51() {
        return this.isSimilarOOSWishListLuxeANDOOSBagEnabled;
    }

    public final boolean component52() {
        return this.isHeaderNotEmpty;
    }

    public final String component53() {
        return this.headerText;
    }

    public final List component54() {
        return this.variantOptions;
    }

    public final List component55() {
        return this.productOptionVariants;
    }

    public final boolean component56() {
        return this.populateSelectSizeLabel;
    }

    public final String component57() {
        return this.deleteWishlistContentDescription;
    }

    public final String component58() {
        return this.addToBagContentDescription;
    }

    public final String component59() {
        return this.oosSimilarContentDescription;
    }

    public final HomeWidgetTypes component6() {
        return this.productType;
    }

    public final String component60() {
        return this.closetAddBagContentDescription;
    }

    public final boolean component61() {
        return this.isImageLoaded;
    }

    public final boolean component62() {
        return this.isLuxeCartPriceEnable;
    }

    public final boolean component63() {
        return this.isAllOutOfStock;
    }

    public final String component64() {
        return this.closetAddBagText;
    }

    public final String component65() {
        return this.addedToCartText;
    }

    public final boolean component66() {
        return this.checkIfTalkbackServiceEnabled;
    }

    public final boolean component67() {
        return this.isSimilarOOSWishlistEnabled;
    }

    public final boolean component68() {
        return this.isSelectionMode;
    }

    public final boolean component69() {
        return this.isPositionSelected;
    }

    public final int component7() {
        return this.viewHolderPos;
    }

    public final boolean component70() {
        return this.isSimilarOOSWishlistLuxeEnabled;
    }

    public final ProductFnlColorVariantData component71() {
        return this.fnlColorVariantData;
    }

    public final boolean component72() {
        return this.isAllPromotions;
    }

    public final String component73() {
        return this.promoContentDescription;
    }

    public final boolean component74() {
        return this.cardUi;
    }

    public final boolean component75() {
        return this.isFromHomeProductWidget;
    }

    public final boolean component76() {
        return this.isPriceDropReqd;
    }

    public final boolean component77() {
        return this.recentlyViewedProdPrice;
    }

    public final boolean component78() {
        return this.priceDropValue;
    }

    public final String component79() {
        return this.priceDrop;
    }

    public final boolean component8() {
        return this.isAjiogramStoreId;
    }

    public final boolean component80() {
        return this.pdpInfoProviderLuxeEnable;
    }

    public final boolean component81() {
        return this.shouldShowProductDescription;
    }

    public final String component82() {
        return this.promoImageurl;
    }

    public final String component83() {
        return this.accBannerDesc;
    }

    public final String component84() {
        return this.colorGroup;
    }

    public final boolean component85() {
        return this.showOODEnable;
    }

    public final boolean component86() {
        return this.isPrioritydeliveryFeatureEnable;
    }

    public final String component87() {
        return this.deliverySlaTag;
    }

    public final boolean component88() {
        return this.showFinalPrice;
    }

    public final String component89() {
        return this.finalPriceValue;
    }

    public final String component9() {
        return this.productImageUrl;
    }

    public final String component90() {
        return this.finalPriceContentDescription;
    }

    public final boolean component91() {
        return this.showMrpPrice;
    }

    public final SpannableString component92() {
        return this.mrpPriceValue;
    }

    public final String component93() {
        return this.mrpPriceContentDescription;
    }

    public final boolean component94() {
        return this.showDiscountPrice;
    }

    public final String component95() {
        return this.discountPriceValue;
    }

    public final String component96() {
        return this.discountPriceContentDescription;
    }

    public final boolean component97() {
        return this.setDiscountColor;
    }

    public final Float component98() {
        return this.wasPriceValue;
    }

    public final Float component99() {
        return this.priceValue;
    }

    public final PlpProductUIModel copy(String string2, String string3, String string4, String string5, Integer n3, HomeWidgetTypes homeWidgetTypes, int n4, boolean bl2, String string6, String string7, ArrayList arrayList, String string8, boolean bl3, String string9, String string10, boolean bl4, String string11, String string12, boolean bl5, String string13, String string14, String string15, boolean bl6, boolean bl7, String string16, String string17, boolean bl8, String string18, boolean bl9, String string19, Boolean bl10, boolean bl11, boolean bl12, boolean bl13, boolean bl14, boolean bl15, boolean bl16, boolean bl17, String string20, String string21, String string22, String string23, String string24, boolean bl18, String string25, boolean bl19, boolean bl20, boolean bl21, boolean bl22, boolean bl23, boolean bl24, boolean bl25, String string26, List list, List list2, boolean bl26, String string27, String string28, String string29, String string30, boolean bl27, boolean bl28, boolean bl29, String string31, String string32, boolean bl30, boolean bl31, boolean bl32, boolean bl33, boolean bl34, ProductFnlColorVariantData productFnlColorVariantData, boolean bl35, String string33, boolean bl36, boolean bl37, boolean bl38, boolean bl39, boolean bl40, String string34, boolean bl41, boolean bl42, String string35, String string36, String string37, boolean bl43, boolean bl44, String string38, boolean bl45, String string39, String string40, boolean bl46, SpannableString spannableString, String string41, boolean bl47, String string42, String string43, boolean bl48, Float f5, Float f6, Float f7, String string44, String string45, boolean bl49, long l2, String string46, boolean bl50, String string47, boolean bl51, boolean bl52, boolean bl53, boolean bl54, String string48, boolean bl55, boolean bl56, boolean bl57, boolean bl58, boolean bl59, boolean bl60, boolean bl61, boolean bl62, boolean bl63, String string49, Double d2, boolean bl64, boolean bl65, boolean bl66, boolean bl67, boolean bl68, boolean bl69, boolean bl70, boolean bl71, boolean bl72, boolean bl73, boolean bl74, boolean bl75, boolean bl76, boolean bl77, boolean bl78, boolean bl79, boolean bl80, boolean bl81, boolean bl82, boolean bl83, boolean bl84, boolean bl85, boolean bl86, boolean bl87, boolean bl88, boolean bl89, boolean bl90, boolean bl91, boolean bl92, boolean bl93, boolean bl94, boolean bl95, boolean bl96) {
        PlpProductUIModel plpProductUIModel = new PlpProductUIModel(string2, string3, string4, string5, n3, homeWidgetTypes, n4, bl2, string6, string7, arrayList, string8, bl3, string9, string10, bl4, string11, string12, bl5, string13, string14, string15, bl6, bl7, string16, string17, bl8, string18, bl9, string19, bl10, bl11, bl12, bl13, bl14, bl15, bl16, bl17, string20, string21, string22, string23, string24, bl18, string25, bl19, bl20, bl21, bl22, bl23, bl24, bl25, string26, list, list2, bl26, string27, string28, string29, string30, bl27, bl28, bl29, string31, string32, bl30, bl31, bl32, bl33, bl34, productFnlColorVariantData, bl35, string33, bl36, bl37, bl38, bl39, bl40, string34, bl41, bl42, string35, string36, string37, bl43, bl44, string38, bl45, string39, string40, bl46, spannableString, string41, bl47, string42, string43, bl48, f5, f6, f7, string44, string45, bl49, l2, string46, bl50, string47, bl51, bl52, bl53, bl54, string48, bl55, bl56, bl57, bl58, bl59, bl60, bl61, bl62, bl63, string49, d2, bl64, bl65, bl66, bl67, bl68, bl69, bl70, bl71, bl72, bl73, bl74, bl75, bl76, bl77, bl78, bl79, bl80, bl81, bl82, bl83, bl84, bl85, bl86, bl87, bl88, bl89, bl90, bl91, bl92, bl93, bl94, bl95, bl96);
        return plpProductUIModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof PlpProductUIModel;
        if (n3 == 0) {
            return false;
        }
        object = (PlpProductUIModel)object;
        Object object2 = this.brandName;
        Object object3 = ((PlpProductUIModel)object).brandName;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.productName;
        object3 = ((PlpProductUIModel)object).productName;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.productCode;
        object3 = ((PlpProductUIModel)object).productCode;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.productColorCode;
        object3 = ((PlpProductUIModel)object).productColorCode;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.viewTypeWishlist;
        object3 = ((PlpProductUIModel)object).viewTypeWishlist;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.productType;
        object3 = ((PlpProductUIModel)object).productType;
        if (object2 != object3) {
            return false;
        }
        n3 = this.viewHolderPos;
        int n4 = ((PlpProductUIModel)object).viewHolderPos;
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isAjiogramStoreId ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isAjiogramStoreId ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.productImageUrl;
        object3 = ((PlpProductUIModel)object).productImageUrl;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.productImageContentDescription;
        object3 = ((PlpProductUIModel)object).productImageContentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.extraImagesUrlList;
        object3 = ((PlpProductUIModel)object).extraImagesUrlList;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.productImgPlaceholerDescription;
        object3 = ((PlpProductUIModel)object).productImgPlaceholerDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.isSimilarProductEnabled ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isSimilarProductEnabled ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.similarProductType;
        object3 = ((PlpProductUIModel)object).similarProductType;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.similarIconContentDescription;
        object3 = ((PlpProductUIModel)object).similarIconContentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.isProductWishlisted ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isProductWishlisted ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.wishlistCountShortText;
        object3 = ((PlpProductUIModel)object).wishlistCountShortText;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.wishlistCountLongText;
        object3 = ((PlpProductUIModel)object).wishlistCountLongText;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.isWishlistCountAvailable ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isWishlistCountAvailable ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.closetButtonContentDescription;
        object3 = ((PlpProductUIModel)object).closetButtonContentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.closetAddedButtonContentDescription;
        object3 = ((PlpProductUIModel)object).closetAddedButtonContentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.closetSimilarContentDescription;
        object3 = ((PlpProductUIModel)object).closetSimilarContentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.showProductTags ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showProductTags ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.showAdTag ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showAdTag ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.productTagValue;
        object3 = ((PlpProductUIModel)object).productTagValue;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.productTagViewContentDescription;
        object3 = ((PlpProductUIModel)object).productTagViewContentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.isPlpUrgencyTagEnabled ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isPlpUrgencyTagEnabled ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.urgencyTagValue;
        object3 = ((PlpProductUIModel)object).urgencyTagValue;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.isPlpBargainUrgencyTagEnabled ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isPlpBargainUrgencyTagEnabled ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.bargainUrgencyTagValue;
        object3 = ((PlpProductUIModel)object).bargainUrgencyTagValue;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.isAjiogramProduct;
        object3 = ((PlpProductUIModel)object).isAjiogramProduct;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.showSizeLayout ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showSizeLayout ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.showSizeVariants ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showSizeVariants ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.showSizeFirstView ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showSizeFirstView ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.showSizeSecondView ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showSizeSecondView ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.showSizeThirdView ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showSizeThirdView ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.showSizeFourthView ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showSizeFourthView ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.showSizeCount ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showSizeCount ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.sizeFirstViewText;
        object3 = ((PlpProductUIModel)object).sizeFirstViewText;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.sizeSecondViewText;
        object3 = ((PlpProductUIModel)object).sizeSecondViewText;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.sizeThirdViewText;
        object3 = ((PlpProductUIModel)object).sizeThirdViewText;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.sizeFourthViewText;
        object3 = ((PlpProductUIModel)object).sizeFourthViewText;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.sizeCountText;
        object3 = ((PlpProductUIModel)object).sizeCountText;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.showSizeView ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showSizeView ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.sizeContentDescription;
        object3 = ((PlpProductUIModel)object).sizeContentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.showAddedToCart ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showAddedToCart ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableAddtoBag ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableAddtoBag ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isComingSoonEnable ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isComingSoonEnable ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isAfterCartLuxEnabled ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isAfterCartLuxEnabled ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isSimilarOOSWishListAjioANDOOSBagEnabled ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isSimilarOOSWishListAjioANDOOSBagEnabled ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isSimilarOOSWishListLuxeANDOOSBagEnabled ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isSimilarOOSWishListLuxeANDOOSBagEnabled ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isHeaderNotEmpty ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isHeaderNotEmpty ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.headerText;
        object3 = ((PlpProductUIModel)object).headerText;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.variantOptions;
        object3 = ((PlpProductUIModel)object).variantOptions;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.productOptionVariants;
        object3 = ((PlpProductUIModel)object).productOptionVariants;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.populateSelectSizeLabel ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).populateSelectSizeLabel ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.deleteWishlistContentDescription;
        object3 = ((PlpProductUIModel)object).deleteWishlistContentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.addToBagContentDescription;
        object3 = ((PlpProductUIModel)object).addToBagContentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.oosSimilarContentDescription;
        object3 = ((PlpProductUIModel)object).oosSimilarContentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.closetAddBagContentDescription;
        object3 = ((PlpProductUIModel)object).closetAddBagContentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.isImageLoaded ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isImageLoaded ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isLuxeCartPriceEnable ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isLuxeCartPriceEnable ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isAllOutOfStock ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isAllOutOfStock ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.closetAddBagText;
        object3 = ((PlpProductUIModel)object).closetAddBagText;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.addedToCartText;
        object3 = ((PlpProductUIModel)object).addedToCartText;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.checkIfTalkbackServiceEnabled ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).checkIfTalkbackServiceEnabled ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isSimilarOOSWishlistEnabled ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isSimilarOOSWishlistEnabled ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isSelectionMode ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isSelectionMode ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isPositionSelected ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isPositionSelected ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isSimilarOOSWishlistLuxeEnabled ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isSimilarOOSWishlistLuxeEnabled ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.fnlColorVariantData;
        object3 = ((PlpProductUIModel)object).fnlColorVariantData;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.isAllPromotions ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isAllPromotions ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.promoContentDescription;
        object3 = ((PlpProductUIModel)object).promoContentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.cardUi ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).cardUi ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isFromHomeProductWidget ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isFromHomeProductWidget ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isPriceDropReqd ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isPriceDropReqd ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.recentlyViewedProdPrice ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).recentlyViewedProdPrice ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.priceDropValue ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).priceDropValue ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.priceDrop;
        object3 = ((PlpProductUIModel)object).priceDrop;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.pdpInfoProviderLuxeEnable ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).pdpInfoProviderLuxeEnable ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.shouldShowProductDescription ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).shouldShowProductDescription ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.promoImageurl;
        object3 = ((PlpProductUIModel)object).promoImageurl;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.accBannerDesc;
        object3 = ((PlpProductUIModel)object).accBannerDesc;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.colorGroup;
        object3 = ((PlpProductUIModel)object).colorGroup;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.showOODEnable ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showOODEnable ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isPrioritydeliveryFeatureEnable ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isPrioritydeliveryFeatureEnable ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.deliverySlaTag;
        object3 = ((PlpProductUIModel)object).deliverySlaTag;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.showFinalPrice ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showFinalPrice ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.finalPriceValue;
        object3 = ((PlpProductUIModel)object).finalPriceValue;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.finalPriceContentDescription;
        object3 = ((PlpProductUIModel)object).finalPriceContentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.showMrpPrice ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showMrpPrice ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.mrpPriceValue;
        object3 = ((PlpProductUIModel)object).mrpPriceValue;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.mrpPriceContentDescription;
        object3 = ((PlpProductUIModel)object).mrpPriceContentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.showDiscountPrice ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showDiscountPrice ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.discountPriceValue;
        object3 = ((PlpProductUIModel)object).discountPriceValue;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.discountPriceContentDescription;
        object3 = ((PlpProductUIModel)object).discountPriceContentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.setDiscountColor ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).setDiscountColor ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.wasPriceValue;
        object3 = ((PlpProductUIModel)object).wasPriceValue;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.priceValue;
        object3 = ((PlpProductUIModel)object).priceValue;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.bestPriceValue;
        object3 = ((PlpProductUIModel)object).bestPriceValue;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.discountPercentValue;
        object3 = ((PlpProductUIModel)object).discountPercentValue;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.offerPrice;
        object3 = ((PlpProductUIModel)object).offerPrice;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.isDodEnabled ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isDodEnabled ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        long l2 = this.dodEndTime;
        long l3 = ((PlpProductUIModel)object).dodEndTime;
        long l4 = l2 - l3;
        n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
        if (n3 != 0) {
            return false;
        }
        object2 = this.offerPriceValue;
        object3 = ((PlpProductUIModel)object).offerPriceValue;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.showOfferPrice ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showOfferPrice ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.offerPriceContentDescription;
        object3 = ((PlpProductUIModel)object).offerPriceContentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.setOfferPriceDrawable ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).setOfferPriceDrawable ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.setOfferPrice ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).setOfferPrice ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isGwpEnabled ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isGwpEnabled ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isGiftAvailable ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isGiftAvailable ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.gwpFreebiesOneText;
        object3 = ((PlpProductUIModel)object).gwpFreebiesOneText;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.isLuxeEnabled ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isLuxeEnabled ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isGWPFeatureEnabledAjioLuxe ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isGWPFeatureEnabledAjioLuxe ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isPreSalePlp ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isPreSalePlp ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isSaleWishlist ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isSaleWishlist ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableSaleContainer ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableSaleContainer ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isLuxeAfercartAndLuxeEnable ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isLuxeAfercartAndLuxeEnable ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isSaleContainerSpaceRetained ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isSaleContainerSpaceRetained ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isRatingEnabledPlp ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isRatingEnabledPlp ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isRatingStarDisplayEnabled ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isRatingStarDisplayEnabled ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.productRatingCount;
        object3 = ((PlpProductUIModel)object).productRatingCount;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.averageRating;
        object3 = ((PlpProductUIModel)object).averageRating;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.showAjiogramTag ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showAjiogramTag ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.showPlpGrid ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).showPlpGrid ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.productTextWrap ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).productTextWrap ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableAddtoCart ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableAddtoCart ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableCartClosetSizeLayout ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableCartClosetSizeLayout ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableCartClosetSelectSize ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableCartClosetSelectSize ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enabledeleteImg ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enabledeleteImg ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableSimilarCartClosetCLick ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableSimilarCartClosetCLick ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableAddToBagCartClosetClick ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableAddToBagCartClosetClick ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableDeleteOssContainer ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableDeleteOssContainer ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableOOSTV ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableOOSTV ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableOOSBG ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableOOSBG ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableOutOfStock ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableOutOfStock ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableAddedToBag ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableAddedToBag ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableCartClosetAddToBag ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableCartClosetAddToBag ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.closetSelectionEnable ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).closetSelectionEnable ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isRecentlyViewLayoutChanges ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isRecentlyViewLayoutChanges ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isPromoImageAvailable ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isPromoImageAvailable ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isPriceValueChanges ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).isPriceValueChanges ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableFreebie ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableFreebie ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableWishlistView ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableWishlistView ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableComingSoonProducts ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableComingSoonProducts ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.sellingFastTag ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).sellingFastTag ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.layoutWidthChangesRequired ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).layoutWidthChangesRequired ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enablebackground ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enablebackground ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.enableRatingView ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).enableRatingView ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.cartClosetClickListners ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).cartClosetClickListners ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.cartClickListners ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).cartClickListners ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.luxeCartClickListners ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).luxeCartClickListners ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.recentViewclickListners ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).recentViewclickListners ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.newProductViewClickListeners ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).newProductViewClickListeners ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.productClicklisteners ? 1 : 0);
        n4 = (int)(((PlpProductUIModel)object).productClicklisteners ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isRecentlyWidgetEnable ? 1 : 0);
        int n7 = ((PlpProductUIModel)object).isRecentlyWidgetEnable;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final String getAccBannerDesc() {
        return this.accBannerDesc;
    }

    public final String getAddToBagContentDescription() {
        return this.addToBagContentDescription;
    }

    public final String getAddedToCartText() {
        return this.addedToCartText;
    }

    public final Double getAverageRating() {
        return this.averageRating;
    }

    public final String getBargainUrgencyTagValue() {
        return this.bargainUrgencyTagValue;
    }

    public final Float getBestPriceValue() {
        return this.bestPriceValue;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final boolean getCardUi() {
        return this.cardUi;
    }

    public final boolean getCartClickListners() {
        return this.cartClickListners;
    }

    public final boolean getCartClosetClickListners() {
        return this.cartClosetClickListners;
    }

    public final boolean getCheckIfTalkbackServiceEnabled() {
        return this.checkIfTalkbackServiceEnabled;
    }

    public final String getClosetAddBagContentDescription() {
        return this.closetAddBagContentDescription;
    }

    public final String getClosetAddBagText() {
        return this.closetAddBagText;
    }

    public final String getClosetAddedButtonContentDescription() {
        return this.closetAddedButtonContentDescription;
    }

    public final String getClosetButtonContentDescription() {
        return this.closetButtonContentDescription;
    }

    public final boolean getClosetSelectionEnable() {
        return this.closetSelectionEnable;
    }

    public final String getClosetSimilarContentDescription() {
        return this.closetSimilarContentDescription;
    }

    public final String getColorGroup() {
        return this.colorGroup;
    }

    public final String getDeleteWishlistContentDescription() {
        return this.deleteWishlistContentDescription;
    }

    public final String getDeliverySlaTag() {
        return this.deliverySlaTag;
    }

    public final String getDiscountPercentValue() {
        return this.discountPercentValue;
    }

    public final String getDiscountPriceContentDescription() {
        return this.discountPriceContentDescription;
    }

    public final String getDiscountPriceValue() {
        return this.discountPriceValue;
    }

    public final long getDodEndTime() {
        return this.dodEndTime;
    }

    public final boolean getEnableAddToBagCartClosetClick() {
        return this.enableAddToBagCartClosetClick;
    }

    public final boolean getEnableAddedToBag() {
        return this.enableAddedToBag;
    }

    public final boolean getEnableAddtoBag() {
        return this.enableAddtoBag;
    }

    public final boolean getEnableAddtoCart() {
        return this.enableAddtoCart;
    }

    public final boolean getEnableCartClosetAddToBag() {
        return this.enableCartClosetAddToBag;
    }

    public final boolean getEnableCartClosetSelectSize() {
        return this.enableCartClosetSelectSize;
    }

    public final boolean getEnableCartClosetSizeLayout() {
        return this.enableCartClosetSizeLayout;
    }

    public final boolean getEnableComingSoonProducts() {
        return this.enableComingSoonProducts;
    }

    public final boolean getEnableDeleteOssContainer() {
        return this.enableDeleteOssContainer;
    }

    public final boolean getEnableFreebie() {
        return this.enableFreebie;
    }

    public final boolean getEnableOOSBG() {
        return this.enableOOSBG;
    }

    public final boolean getEnableOOSTV() {
        return this.enableOOSTV;
    }

    public final boolean getEnableOutOfStock() {
        return this.enableOutOfStock;
    }

    public final boolean getEnableRatingView() {
        return this.enableRatingView;
    }

    public final boolean getEnableSaleContainer() {
        return this.enableSaleContainer;
    }

    public final boolean getEnableSimilarCartClosetCLick() {
        return this.enableSimilarCartClosetCLick;
    }

    public final boolean getEnableWishlistView() {
        return this.enableWishlistView;
    }

    public final boolean getEnablebackground() {
        return this.enablebackground;
    }

    public final boolean getEnabledeleteImg() {
        return this.enabledeleteImg;
    }

    public final ArrayList getExtraImagesUrlList() {
        return this.extraImagesUrlList;
    }

    public final String getFinalPriceContentDescription() {
        return this.finalPriceContentDescription;
    }

    public final String getFinalPriceValue() {
        return this.finalPriceValue;
    }

    public final ProductFnlColorVariantData getFnlColorVariantData() {
        return this.fnlColorVariantData;
    }

    public final String getGwpFreebiesOneText() {
        return this.gwpFreebiesOneText;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final boolean getLayoutWidthChangesRequired() {
        return this.layoutWidthChangesRequired;
    }

    public final boolean getLuxeCartClickListners() {
        return this.luxeCartClickListners;
    }

    public final String getMrpPriceContentDescription() {
        return this.mrpPriceContentDescription;
    }

    public final SpannableString getMrpPriceValue() {
        return this.mrpPriceValue;
    }

    public final boolean getNewProductViewClickListeners() {
        return this.newProductViewClickListeners;
    }

    public final String getOfferPrice() {
        return this.offerPrice;
    }

    public final String getOfferPriceContentDescription() {
        return this.offerPriceContentDescription;
    }

    public final String getOfferPriceValue() {
        return this.offerPriceValue;
    }

    public final String getOosSimilarContentDescription() {
        return this.oosSimilarContentDescription;
    }

    public final boolean getPdpInfoProviderLuxeEnable() {
        return this.pdpInfoProviderLuxeEnable;
    }

    public final boolean getPopulateSelectSizeLabel() {
        return this.populateSelectSizeLabel;
    }

    public final String getPriceDrop() {
        return this.priceDrop;
    }

    public final boolean getPriceDropValue() {
        return this.priceDropValue;
    }

    public final Float getPriceValue() {
        return this.priceValue;
    }

    public final boolean getProductClicklisteners() {
        return this.productClicklisteners;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getProductColorCode() {
        return this.productColorCode;
    }

    public final String getProductImageContentDescription() {
        return this.productImageContentDescription;
    }

    public final String getProductImageUrl() {
        return this.productImageUrl;
    }

    public final String getProductImgPlaceholerDescription() {
        return this.productImgPlaceholerDescription;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final List getProductOptionVariants() {
        return this.productOptionVariants;
    }

    public final String getProductRatingCount() {
        return this.productRatingCount;
    }

    public final String getProductTagValue() {
        return this.productTagValue;
    }

    public final String getProductTagViewContentDescription() {
        return this.productTagViewContentDescription;
    }

    public final boolean getProductTextWrap() {
        return this.productTextWrap;
    }

    public final HomeWidgetTypes getProductType() {
        return this.productType;
    }

    public final String getPromoContentDescription() {
        return this.promoContentDescription;
    }

    public final String getPromoImageurl() {
        return this.promoImageurl;
    }

    public final boolean getRecentViewclickListners() {
        return this.recentViewclickListners;
    }

    public final boolean getRecentlyViewedProdPrice() {
        return this.recentlyViewedProdPrice;
    }

    public final boolean getSellingFastTag() {
        return this.sellingFastTag;
    }

    public final boolean getSetDiscountColor() {
        return this.setDiscountColor;
    }

    public final boolean getSetOfferPrice() {
        return this.setOfferPrice;
    }

    public final boolean getSetOfferPriceDrawable() {
        return this.setOfferPriceDrawable;
    }

    public final boolean getShouldShowProductDescription() {
        return this.shouldShowProductDescription;
    }

    public final boolean getShowAdTag() {
        return this.showAdTag;
    }

    public final boolean getShowAddedToCart() {
        return this.showAddedToCart;
    }

    public final boolean getShowAjiogramTag() {
        return this.showAjiogramTag;
    }

    public final boolean getShowDiscountPrice() {
        return this.showDiscountPrice;
    }

    public final boolean getShowFinalPrice() {
        return this.showFinalPrice;
    }

    public final boolean getShowMrpPrice() {
        return this.showMrpPrice;
    }

    public final boolean getShowOODEnable() {
        return this.showOODEnable;
    }

    public final boolean getShowOfferPrice() {
        return this.showOfferPrice;
    }

    public final boolean getShowPlpGrid() {
        return this.showPlpGrid;
    }

    public final boolean getShowProductTags() {
        return this.showProductTags;
    }

    public final boolean getShowSizeCount() {
        return this.showSizeCount;
    }

    public final boolean getShowSizeFirstView() {
        return this.showSizeFirstView;
    }

    public final boolean getShowSizeFourthView() {
        return this.showSizeFourthView;
    }

    public final boolean getShowSizeLayout() {
        return this.showSizeLayout;
    }

    public final boolean getShowSizeSecondView() {
        return this.showSizeSecondView;
    }

    public final boolean getShowSizeThirdView() {
        return this.showSizeThirdView;
    }

    public final boolean getShowSizeVariants() {
        return this.showSizeVariants;
    }

    public final boolean getShowSizeView() {
        return this.showSizeView;
    }

    public final String getSimilarIconContentDescription() {
        return this.similarIconContentDescription;
    }

    public final String getSimilarProductType() {
        return this.similarProductType;
    }

    public final String getSizeContentDescription() {
        return this.sizeContentDescription;
    }

    public final String getSizeCountText() {
        return this.sizeCountText;
    }

    public final String getSizeFirstViewText() {
        return this.sizeFirstViewText;
    }

    public final String getSizeFourthViewText() {
        return this.sizeFourthViewText;
    }

    public final String getSizeSecondViewText() {
        return this.sizeSecondViewText;
    }

    public final String getSizeThirdViewText() {
        return this.sizeThirdViewText;
    }

    public final String getUrgencyTagValue() {
        return this.urgencyTagValue;
    }

    public final List getVariantOptions() {
        return this.variantOptions;
    }

    public final int getViewHolderPos() {
        return this.viewHolderPos;
    }

    public final Integer getViewTypeWishlist() {
        return this.viewTypeWishlist;
    }

    public final Float getWasPriceValue() {
        return this.wasPriceValue;
    }

    public final String getWishlistCountLongText() {
        return this.wishlistCountLongText;
    }

    public final String getWishlistCountShortText() {
        return this.wishlistCountShortText;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.brandName;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.productName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productColorCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.viewTypeWishlist;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = this.viewHolderPos;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isAjiogramStoreId ? 1 : 0);
        int n8 = 1237;
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.productImageUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productImageContentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.extraImagesUrlList;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productImgPlaceholerDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isSimilarProductEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.similarProductType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.similarIconContentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isProductWishlisted ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.wishlistCountShortText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.wishlistCountLongText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isWishlistCountAvailable ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.closetButtonContentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.closetAddedButtonContentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.closetSimilarContentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showProductTags ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showAdTag ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.productTagValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productTagViewContentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isPlpUrgencyTagEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.urgencyTagValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isPlpBargainUrgencyTagEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.bargainUrgencyTagValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isAjiogramProduct;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showSizeLayout ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showSizeVariants ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showSizeFirstView ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showSizeSecondView ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showSizeThirdView ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showSizeFourthView ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showSizeCount ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.sizeFirstViewText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sizeSecondViewText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sizeThirdViewText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sizeFourthViewText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sizeCountText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showSizeView ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.sizeContentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showAddedToCart ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.enableAddtoBag ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isComingSoonEnable ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isAfterCartLuxEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isSimilarOOSWishListAjioANDOOSBagEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isSimilarOOSWishListLuxeANDOOSBagEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isHeaderNotEmpty ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.headerText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.variantOptions;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productOptionVariants;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.populateSelectSizeLabel ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.deleteWishlistContentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.addToBagContentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.oosSimilarContentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.closetAddBagContentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isImageLoaded ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isLuxeCartPriceEnable ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isAllOutOfStock ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.closetAddBagText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.addedToCartText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.checkIfTalkbackServiceEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isSimilarOOSWishlistEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isSelectionMode ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isPositionSelected ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isSimilarOOSWishlistLuxeEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.fnlColorVariantData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isAllPromotions ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.promoContentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.cardUi ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isFromHomeProductWidget ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isPriceDropReqd ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.recentlyViewedProdPrice ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.priceDropValue ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.priceDrop;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.pdpInfoProviderLuxeEnable ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.shouldShowProductDescription ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.promoImageurl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.accBannerDesc;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.colorGroup;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showOODEnable ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isPrioritydeliveryFeatureEnable ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.deliverySlaTag;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showFinalPrice ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.finalPriceValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.finalPriceContentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showMrpPrice ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.mrpPriceValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.mrpPriceContentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showDiscountPrice ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.discountPriceValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.discountPriceContentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.setDiscountColor ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.wasPriceValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.priceValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bestPriceValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.discountPercentValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offerPrice;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isDodEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        long l2 = this.dodEndTime;
        long l3 = l2 >>> 32;
        n3 = (int)(l2 ^= l3);
        n4 = (n4 + n3) * 31;
        object = this.offerPriceValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showOfferPrice ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.offerPriceContentDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.setOfferPriceDrawable ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.setOfferPrice ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isGwpEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isGiftAvailable ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.gwpFreebiesOneText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isLuxeEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isGWPFeatureEnabledAjioLuxe ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isPreSalePlp ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isSaleWishlist ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.enableSaleContainer ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isLuxeAfercartAndLuxeEnable ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isSaleContainerSpaceRetained ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isRatingEnabledPlp ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isRatingStarDisplayEnabled ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.productRatingCount;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.averageRating;
        if (object != null) {
            n7 = object.hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.showAjiogramTag ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.showPlpGrid ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.productTextWrap ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.enableAddtoCart ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.enableCartClosetSizeLayout ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.enableCartClosetSelectSize ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.enabledeleteImg ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.enableSimilarCartClosetCLick ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.enableAddToBagCartClosetClick ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.enableDeleteOssContainer ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.enableOOSTV ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.enableOOSBG ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.enableOutOfStock ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.enableAddedToBag ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.enableCartClosetAddToBag ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.closetSelectionEnable ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.isRecentlyViewLayoutChanges ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.isPromoImageAvailable ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.isPriceValueChanges ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.enableFreebie ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.enableWishlistView ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.enableComingSoonProducts ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.sellingFastTag ? 1 : 0);
        if (n7 != 0) {
            n8 = 1231;
        }
        n4 = (n4 + n8) * 31;
        n7 = (sv2_2.a(this.layoutWidthChangesRequired) + n4) * 31;
        n4 = (sv2_2.a(this.enablebackground) + n7) * 31;
        n7 = (sv2_2.a(this.enableRatingView) + n4) * 31;
        n4 = (sv2_2.a(this.cartClosetClickListners) + n7) * 31;
        n7 = (sv2_2.a(this.cartClickListners) + n4) * 31;
        n4 = (sv2_2.a(this.luxeCartClickListners) + n7) * 31;
        n7 = (sv2_2.a(this.recentViewclickListners) + n4) * 31;
        n4 = (sv2_2.a(this.newProductViewClickListeners) + n7) * 31;
        n7 = (sv2_2.a(this.productClicklisteners) + n4) * 31;
        return sv2_2.a(this.isRecentlyWidgetEnable) + n7;
    }

    public final boolean isAfterCartLuxEnabled() {
        return this.isAfterCartLuxEnabled;
    }

    public final Boolean isAjiogramProduct() {
        return this.isAjiogramProduct;
    }

    public final boolean isAjiogramStoreId() {
        return this.isAjiogramStoreId;
    }

    public final boolean isAllOutOfStock() {
        return this.isAllOutOfStock;
    }

    public final boolean isAllPromotions() {
        return this.isAllPromotions;
    }

    public final boolean isComingSoonEnable() {
        return this.isComingSoonEnable;
    }

    public final boolean isDodEnabled() {
        return this.isDodEnabled;
    }

    public final boolean isFromHomeProductWidget() {
        return this.isFromHomeProductWidget;
    }

    public final boolean isGWPFeatureEnabledAjioLuxe() {
        return this.isGWPFeatureEnabledAjioLuxe;
    }

    public final boolean isGiftAvailable() {
        return this.isGiftAvailable;
    }

    public final boolean isGwpEnabled() {
        return this.isGwpEnabled;
    }

    public final boolean isHeaderNotEmpty() {
        return this.isHeaderNotEmpty;
    }

    public final boolean isImageLoaded() {
        return this.isImageLoaded;
    }

    public final boolean isLuxeAfercartAndLuxeEnable() {
        return this.isLuxeAfercartAndLuxeEnable;
    }

    public final boolean isLuxeCartPriceEnable() {
        return this.isLuxeCartPriceEnable;
    }

    public final boolean isLuxeEnabled() {
        return this.isLuxeEnabled;
    }

    public final boolean isPlpBargainUrgencyTagEnabled() {
        return this.isPlpBargainUrgencyTagEnabled;
    }

    public final boolean isPlpUrgencyTagEnabled() {
        return this.isPlpUrgencyTagEnabled;
    }

    public final boolean isPositionSelected() {
        return this.isPositionSelected;
    }

    public final boolean isPreSalePlp() {
        return this.isPreSalePlp;
    }

    public final boolean isPriceDropReqd() {
        return this.isPriceDropReqd;
    }

    public final boolean isPriceValueChanges() {
        return this.isPriceValueChanges;
    }

    public final boolean isPrioritydeliveryFeatureEnable() {
        return this.isPrioritydeliveryFeatureEnable;
    }

    public final boolean isProductWishlisted() {
        return this.isProductWishlisted;
    }

    public final boolean isPromoImageAvailable() {
        return this.isPromoImageAvailable;
    }

    public final boolean isRatingEnabledPlp() {
        return this.isRatingEnabledPlp;
    }

    public final boolean isRatingStarDisplayEnabled() {
        return this.isRatingStarDisplayEnabled;
    }

    public final boolean isRecentlyViewLayoutChanges() {
        return this.isRecentlyViewLayoutChanges;
    }

    public final boolean isRecentlyWidgetEnable() {
        return this.isRecentlyWidgetEnable;
    }

    public final boolean isSaleContainerSpaceRetained() {
        return this.isSaleContainerSpaceRetained;
    }

    public final boolean isSaleWishlist() {
        return this.isSaleWishlist;
    }

    public final boolean isSelectionMode() {
        return this.isSelectionMode;
    }

    public final boolean isSimilarOOSWishListAjioANDOOSBagEnabled() {
        return this.isSimilarOOSWishListAjioANDOOSBagEnabled;
    }

    public final boolean isSimilarOOSWishListLuxeANDOOSBagEnabled() {
        return this.isSimilarOOSWishListLuxeANDOOSBagEnabled;
    }

    public final boolean isSimilarOOSWishlistEnabled() {
        return this.isSimilarOOSWishlistEnabled;
    }

    public final boolean isSimilarOOSWishlistLuxeEnabled() {
        return this.isSimilarOOSWishlistLuxeEnabled;
    }

    public final boolean isSimilarProductEnabled() {
        return this.isSimilarProductEnabled;
    }

    public final boolean isWishlistCountAvailable() {
        return this.isWishlistCountAvailable;
    }

    public final void setAccBannerDesc(String string2) {
        this.accBannerDesc = string2;
    }

    public final void setAddToBagContentDescription(String string2) {
        this.addToBagContentDescription = string2;
    }

    public final void setAddedToCartText(String string2) {
        this.addedToCartText = string2;
    }

    public final void setAfterCartLuxEnabled(boolean bl2) {
        this.isAfterCartLuxEnabled = bl2;
    }

    public final void setAjiogramProduct(Boolean bl2) {
        this.isAjiogramProduct = bl2;
    }

    public final void setAjiogramStoreId(boolean bl2) {
        this.isAjiogramStoreId = bl2;
    }

    public final void setAllOutOfStock(boolean bl2) {
        this.isAllOutOfStock = bl2;
    }

    public final void setAllPromotions(boolean bl2) {
        this.isAllPromotions = bl2;
    }

    public final void setAverageRating(Double d2) {
        this.averageRating = d2;
    }

    public final void setBargainUrgencyTagValue(String string2) {
        this.bargainUrgencyTagValue = string2;
    }

    public final void setBestPriceValue(Float f5) {
        this.bestPriceValue = f5;
    }

    public final void setBrandName(String string2) {
        this.brandName = string2;
    }

    public final void setCardUi(boolean bl2) {
        this.cardUi = bl2;
    }

    public final void setCartClickListners(boolean bl2) {
        this.cartClickListners = bl2;
    }

    public final void setCartClosetClickListners(boolean bl2) {
        this.cartClosetClickListners = bl2;
    }

    public final void setCheckIfTalkbackServiceEnabled(boolean bl2) {
        this.checkIfTalkbackServiceEnabled = bl2;
    }

    public final void setClosetAddBagContentDescription(String string2) {
        this.closetAddBagContentDescription = string2;
    }

    public final void setClosetAddBagText(String string2) {
        this.closetAddBagText = string2;
    }

    public final void setClosetAddedButtonContentDescription(String string2) {
        this.closetAddedButtonContentDescription = string2;
    }

    public final void setClosetButtonContentDescription(String string2) {
        this.closetButtonContentDescription = string2;
    }

    public final void setClosetSelectionEnable(boolean bl2) {
        this.closetSelectionEnable = bl2;
    }

    public final void setClosetSimilarContentDescription(String string2) {
        this.closetSimilarContentDescription = string2;
    }

    public final void setColorGroup(String string2) {
        this.colorGroup = string2;
    }

    public final void setComingSoonEnable(boolean bl2) {
        this.isComingSoonEnable = bl2;
    }

    public final void setDeleteWishlistContentDescription(String string2) {
        this.deleteWishlistContentDescription = string2;
    }

    public final void setDeliverySlaTag(String string2) {
        this.deliverySlaTag = string2;
    }

    public final void setDiscountPercentValue(String string2) {
        this.discountPercentValue = string2;
    }

    public final void setDiscountPriceContentDescription(String string2) {
        this.discountPriceContentDescription = string2;
    }

    public final void setDiscountPriceValue(String string2) {
        this.discountPriceValue = string2;
    }

    public final void setDodEnabled(boolean bl2) {
        this.isDodEnabled = bl2;
    }

    public final void setDodEndTime(long l2) {
        this.dodEndTime = l2;
    }

    public final void setEnableAddToBagCartClosetClick(boolean bl2) {
        this.enableAddToBagCartClosetClick = bl2;
    }

    public final void setEnableAddedToBag(boolean bl2) {
        this.enableAddedToBag = bl2;
    }

    public final void setEnableAddtoBag(boolean bl2) {
        this.enableAddtoBag = bl2;
    }

    public final void setEnableAddtoCart(boolean bl2) {
        this.enableAddtoCart = bl2;
    }

    public final void setEnableCartClosetAddToBag(boolean bl2) {
        this.enableCartClosetAddToBag = bl2;
    }

    public final void setEnableCartClosetSelectSize(boolean bl2) {
        this.enableCartClosetSelectSize = bl2;
    }

    public final void setEnableCartClosetSizeLayout(boolean bl2) {
        this.enableCartClosetSizeLayout = bl2;
    }

    public final void setEnableComingSoonProducts(boolean bl2) {
        this.enableComingSoonProducts = bl2;
    }

    public final void setEnableDeleteOssContainer(boolean bl2) {
        this.enableDeleteOssContainer = bl2;
    }

    public final void setEnableFreebie(boolean bl2) {
        this.enableFreebie = bl2;
    }

    public final void setEnableOOSBG(boolean bl2) {
        this.enableOOSBG = bl2;
    }

    public final void setEnableOOSTV(boolean bl2) {
        this.enableOOSTV = bl2;
    }

    public final void setEnableOutOfStock(boolean bl2) {
        this.enableOutOfStock = bl2;
    }

    public final void setEnableRatingView(boolean bl2) {
        this.enableRatingView = bl2;
    }

    public final void setEnableSaleContainer(boolean bl2) {
        this.enableSaleContainer = bl2;
    }

    public final void setEnableSimilarCartClosetCLick(boolean bl2) {
        this.enableSimilarCartClosetCLick = bl2;
    }

    public final void setEnableWishlistView(boolean bl2) {
        this.enableWishlistView = bl2;
    }

    public final void setEnablebackground(boolean bl2) {
        this.enablebackground = bl2;
    }

    public final void setEnabledeleteImg(boolean bl2) {
        this.enabledeleteImg = bl2;
    }

    public final void setExtraImagesUrlList(ArrayList arrayList) {
        this.extraImagesUrlList = arrayList;
    }

    public final void setFinalPriceContentDescription(String string2) {
        this.finalPriceContentDescription = string2;
    }

    public final void setFinalPriceValue(String string2) {
        this.finalPriceValue = string2;
    }

    public final void setFnlColorVariantData(ProductFnlColorVariantData productFnlColorVariantData) {
        this.fnlColorVariantData = productFnlColorVariantData;
    }

    public final void setFromHomeProductWidget(boolean bl2) {
        this.isFromHomeProductWidget = bl2;
    }

    public final void setGWPFeatureEnabledAjioLuxe(boolean bl2) {
        this.isGWPFeatureEnabledAjioLuxe = bl2;
    }

    public final void setGiftAvailable(boolean bl2) {
        this.isGiftAvailable = bl2;
    }

    public final void setGwpEnabled(boolean bl2) {
        this.isGwpEnabled = bl2;
    }

    public final void setGwpFreebiesOneText(String string2) {
        this.gwpFreebiesOneText = string2;
    }

    public final void setHeaderNotEmpty(boolean bl2) {
        this.isHeaderNotEmpty = bl2;
    }

    public final void setHeaderText(String string2) {
        this.headerText = string2;
    }

    public final void setImageLoaded(boolean bl2) {
        this.isImageLoaded = bl2;
    }

    public final void setLayoutWidthChangesRequired(boolean bl2) {
        this.layoutWidthChangesRequired = bl2;
    }

    public final void setLuxeAfercartAndLuxeEnable(boolean bl2) {
        this.isLuxeAfercartAndLuxeEnable = bl2;
    }

    public final void setLuxeCartClickListners(boolean bl2) {
        this.luxeCartClickListners = bl2;
    }

    public final void setLuxeCartPriceEnable(boolean bl2) {
        this.isLuxeCartPriceEnable = bl2;
    }

    public final void setLuxeEnabled(boolean bl2) {
        this.isLuxeEnabled = bl2;
    }

    public final void setMrpPriceContentDescription(String string2) {
        this.mrpPriceContentDescription = string2;
    }

    public final void setMrpPriceValue(SpannableString spannableString) {
        this.mrpPriceValue = spannableString;
    }

    public final void setNewProductViewClickListeners(boolean bl2) {
        this.newProductViewClickListeners = bl2;
    }

    public final void setOfferPrice(String string2) {
        this.offerPrice = string2;
    }

    public final void setOfferPriceContentDescription(String string2) {
        this.offerPriceContentDescription = string2;
    }

    public final void setOfferPriceValue(String string2) {
        this.offerPriceValue = string2;
    }

    public final void setOosSimilarContentDescription(String string2) {
        this.oosSimilarContentDescription = string2;
    }

    public final void setPdpInfoProviderLuxeEnable(boolean bl2) {
        this.pdpInfoProviderLuxeEnable = bl2;
    }

    public final void setPlpBargainUrgencyTagEnabled(boolean bl2) {
        this.isPlpBargainUrgencyTagEnabled = bl2;
    }

    public final void setPlpUrgencyTagEnabled(boolean bl2) {
        this.isPlpUrgencyTagEnabled = bl2;
    }

    public final void setPopulateSelectSizeLabel(boolean bl2) {
        this.populateSelectSizeLabel = bl2;
    }

    public final void setPositionSelected(boolean bl2) {
        this.isPositionSelected = bl2;
    }

    public final void setPreSalePlp(boolean bl2) {
        this.isPreSalePlp = bl2;
    }

    public final void setPriceDrop(String string2) {
        this.priceDrop = string2;
    }

    public final void setPriceDropReqd(boolean bl2) {
        this.isPriceDropReqd = bl2;
    }

    public final void setPriceDropValue(boolean bl2) {
        this.priceDropValue = bl2;
    }

    public final void setPriceValue(Float f5) {
        this.priceValue = f5;
    }

    public final void setPriceValueChanges(boolean bl2) {
        this.isPriceValueChanges = bl2;
    }

    public final void setPrioritydeliveryFeatureEnable(boolean bl2) {
        this.isPrioritydeliveryFeatureEnable = bl2;
    }

    public final void setProductClicklisteners(boolean bl2) {
        this.productClicklisteners = bl2;
    }

    public final void setProductCode(String string2) {
        this.productCode = string2;
    }

    public final void setProductColorCode(String string2) {
        this.productColorCode = string2;
    }

    public final void setProductImageContentDescription(String string2) {
        this.productImageContentDescription = string2;
    }

    public final void setProductImageUrl(String string2) {
        this.productImageUrl = string2;
    }

    public final void setProductImgPlaceholerDescription(String string2) {
        this.productImgPlaceholerDescription = string2;
    }

    public final void setProductName(String string2) {
        this.productName = string2;
    }

    public final void setProductOptionVariants(List list) {
        this.productOptionVariants = list;
    }

    public final void setProductRatingCount(String string2) {
        this.productRatingCount = string2;
    }

    public final void setProductTagValue(String string2) {
        this.productTagValue = string2;
    }

    public final void setProductTagViewContentDescription(String string2) {
        this.productTagViewContentDescription = string2;
    }

    public final void setProductTextWrap(boolean bl2) {
        this.productTextWrap = bl2;
    }

    public final void setProductType(HomeWidgetTypes homeWidgetTypes) {
        this.productType = homeWidgetTypes;
    }

    public final void setProductWishlisted(boolean bl2) {
        this.isProductWishlisted = bl2;
    }

    public final void setPromoContentDescription(String string2) {
        this.promoContentDescription = string2;
    }

    public final void setPromoImageAvailable(boolean bl2) {
        this.isPromoImageAvailable = bl2;
    }

    public final void setPromoImageurl(String string2) {
        this.promoImageurl = string2;
    }

    public final void setRatingEnabledPlp(boolean bl2) {
        this.isRatingEnabledPlp = bl2;
    }

    public final void setRatingStarDisplayEnabled(boolean bl2) {
        this.isRatingStarDisplayEnabled = bl2;
    }

    public final void setRecentViewclickListners(boolean bl2) {
        this.recentViewclickListners = bl2;
    }

    public final void setRecentlyViewLayoutChanges(boolean bl2) {
        this.isRecentlyViewLayoutChanges = bl2;
    }

    public final void setRecentlyViewedProdPrice(boolean bl2) {
        this.recentlyViewedProdPrice = bl2;
    }

    public final void setRecentlyWidgetEnable(boolean bl2) {
        this.isRecentlyWidgetEnable = bl2;
    }

    public final void setSaleContainerSpaceRetained(boolean bl2) {
        this.isSaleContainerSpaceRetained = bl2;
    }

    public final void setSaleWishlist(boolean bl2) {
        this.isSaleWishlist = bl2;
    }

    public final void setSelectionMode(boolean bl2) {
        this.isSelectionMode = bl2;
    }

    public final void setSellingFastTag(boolean bl2) {
        this.sellingFastTag = bl2;
    }

    public final void setSetDiscountColor(boolean bl2) {
        this.setDiscountColor = bl2;
    }

    public final void setSetOfferPrice(boolean bl2) {
        this.setOfferPrice = bl2;
    }

    public final void setSetOfferPriceDrawable(boolean bl2) {
        this.setOfferPriceDrawable = bl2;
    }

    public final void setShouldShowProductDescription(boolean bl2) {
        this.shouldShowProductDescription = bl2;
    }

    public final void setShowAdTag(boolean bl2) {
        this.showAdTag = bl2;
    }

    public final void setShowAddedToCart(boolean bl2) {
        this.showAddedToCart = bl2;
    }

    public final void setShowAjiogramTag(boolean bl2) {
        this.showAjiogramTag = bl2;
    }

    public final void setShowDiscountPrice(boolean bl2) {
        this.showDiscountPrice = bl2;
    }

    public final void setShowFinalPrice(boolean bl2) {
        this.showFinalPrice = bl2;
    }

    public final void setShowMrpPrice(boolean bl2) {
        this.showMrpPrice = bl2;
    }

    public final void setShowOODEnable(boolean bl2) {
        this.showOODEnable = bl2;
    }

    public final void setShowOfferPrice(boolean bl2) {
        this.showOfferPrice = bl2;
    }

    public final void setShowPlpGrid(boolean bl2) {
        this.showPlpGrid = bl2;
    }

    public final void setShowProductTags(boolean bl2) {
        this.showProductTags = bl2;
    }

    public final void setShowSizeCount(boolean bl2) {
        this.showSizeCount = bl2;
    }

    public final void setShowSizeFirstView(boolean bl2) {
        this.showSizeFirstView = bl2;
    }

    public final void setShowSizeFourthView(boolean bl2) {
        this.showSizeFourthView = bl2;
    }

    public final void setShowSizeLayout(boolean bl2) {
        this.showSizeLayout = bl2;
    }

    public final void setShowSizeSecondView(boolean bl2) {
        this.showSizeSecondView = bl2;
    }

    public final void setShowSizeThirdView(boolean bl2) {
        this.showSizeThirdView = bl2;
    }

    public final void setShowSizeVariants(boolean bl2) {
        this.showSizeVariants = bl2;
    }

    public final void setShowSizeView(boolean bl2) {
        this.showSizeView = bl2;
    }

    public final void setSimilarIconContentDescription(String string2) {
        this.similarIconContentDescription = string2;
    }

    public final void setSimilarOOSWishListAjioANDOOSBagEnabled(boolean bl2) {
        this.isSimilarOOSWishListAjioANDOOSBagEnabled = bl2;
    }

    public final void setSimilarOOSWishListLuxeANDOOSBagEnabled(boolean bl2) {
        this.isSimilarOOSWishListLuxeANDOOSBagEnabled = bl2;
    }

    public final void setSimilarOOSWishlistEnabled(boolean bl2) {
        this.isSimilarOOSWishlistEnabled = bl2;
    }

    public final void setSimilarOOSWishlistLuxeEnabled(boolean bl2) {
        this.isSimilarOOSWishlistLuxeEnabled = bl2;
    }

    public final void setSimilarProductEnabled(boolean bl2) {
        this.isSimilarProductEnabled = bl2;
    }

    public final void setSimilarProductType(String string2) {
        this.similarProductType = string2;
    }

    public final void setSizeContentDescription(String string2) {
        this.sizeContentDescription = string2;
    }

    public final void setSizeCountText(String string2) {
        this.sizeCountText = string2;
    }

    public final void setSizeFirstViewText(String string2) {
        this.sizeFirstViewText = string2;
    }

    public final void setSizeFourthViewText(String string2) {
        this.sizeFourthViewText = string2;
    }

    public final void setSizeSecondViewText(String string2) {
        this.sizeSecondViewText = string2;
    }

    public final void setSizeThirdViewText(String string2) {
        this.sizeThirdViewText = string2;
    }

    public final void setUrgencyTagValue(String string2) {
        this.urgencyTagValue = string2;
    }

    public final void setVariantOptions(List list) {
        this.variantOptions = list;
    }

    public final void setViewHolderPos(int n3) {
        this.viewHolderPos = n3;
    }

    public final void setViewTypeWishlist(Integer n3) {
        this.viewTypeWishlist = n3;
    }

    public final void setWasPriceValue(Float f5) {
        this.wasPriceValue = f5;
    }

    public final void setWishlistCountAvailable(boolean bl2) {
        this.isWishlistCountAvailable = bl2;
    }

    public final void setWishlistCountLongText(String string2) {
        this.wishlistCountLongText = string2;
    }

    public final void setWishlistCountShortText(String string2) {
        this.wishlistCountShortText = string2;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.brandName;
        String string2 = this.productName;
        String string3 = this.productCode;
        String string4 = this.productColorCode;
        Integer n3 = this.viewTypeWishlist;
        HomeWidgetTypes homeWidgetTypes = this.productType;
        int n4 = this.viewHolderPos;
        boolean bl2 = this.isAjiogramStoreId;
        String string5 = this.productImageUrl;
        String string6 = this.productImageContentDescription;
        ArrayList arrayList = this.extraImagesUrlList;
        String string7 = this.productImgPlaceholerDescription;
        boolean bl3 = this.isSimilarProductEnabled;
        String string8 = this.similarProductType;
        String string9 = this.similarIconContentDescription;
        boolean bl4 = this.isProductWishlisted;
        String string10 = this.wishlistCountShortText;
        String string11 = this.wishlistCountLongText;
        boolean bl5 = this.isWishlistCountAvailable;
        String string12 = this.closetButtonContentDescription;
        String string13 = this.closetAddedButtonContentDescription;
        String string14 = this.closetSimilarContentDescription;
        boolean bl6 = this.showProductTags;
        boolean bl7 = this.showAdTag;
        String string15 = this.productTagValue;
        String string16 = this.productTagViewContentDescription;
        boolean bl8 = this.isPlpUrgencyTagEnabled;
        String string17 = this.urgencyTagValue;
        boolean bl9 = this.isPlpBargainUrgencyTagEnabled;
        String string18 = this.bargainUrgencyTagValue;
        Boolean bl10 = this.isAjiogramProduct;
        boolean bl11 = this.showSizeLayout;
        boolean bl12 = this.showSizeVariants;
        boolean bl13 = this.showSizeFirstView;
        boolean bl14 = this.showSizeSecondView;
        boolean bl15 = this.showSizeThirdView;
        boolean bl16 = this.showSizeFourthView;
        boolean bl17 = this.showSizeCount;
        String string19 = this.sizeFirstViewText;
        String string20 = this.sizeSecondViewText;
        String string21 = this.sizeThirdViewText;
        String string22 = this.sizeFourthViewText;
        String string23 = this.sizeCountText;
        boolean bl18 = this.showSizeView;
        String string24 = this.sizeContentDescription;
        boolean bl19 = this.showAddedToCart;
        boolean bl20 = this.enableAddtoBag;
        boolean bl21 = this.isComingSoonEnable;
        boolean bl22 = this.isAfterCartLuxEnabled;
        boolean bl23 = this.isSimilarOOSWishListAjioANDOOSBagEnabled;
        boolean bl24 = this.isSimilarOOSWishListLuxeANDOOSBagEnabled;
        boolean bl25 = this.isHeaderNotEmpty;
        String string25 = this.headerText;
        List list = this.variantOptions;
        List list2 = this.productOptionVariants;
        boolean bl26 = this.populateSelectSizeLabel;
        String string26 = this.deleteWishlistContentDescription;
        String string27 = this.addToBagContentDescription;
        String string28 = this.oosSimilarContentDescription;
        String string29 = this.closetAddBagContentDescription;
        boolean bl27 = this.isImageLoaded;
        boolean bl28 = this.isLuxeCartPriceEnable;
        boolean bl29 = this.isAllOutOfStock;
        String string30 = this.closetAddBagText;
        String string31 = this.addedToCartText;
        boolean bl30 = this.checkIfTalkbackServiceEnabled;
        boolean bl31 = this.isSimilarOOSWishlistEnabled;
        boolean bl32 = this.isSelectionMode;
        boolean bl33 = this.isPositionSelected;
        boolean bl34 = this.isSimilarOOSWishlistLuxeEnabled;
        ProductFnlColorVariantData productFnlColorVariantData = this.fnlColorVariantData;
        boolean bl35 = this.isAllPromotions;
        String string32 = this.promoContentDescription;
        boolean bl36 = this.cardUi;
        boolean bl37 = this.isFromHomeProductWidget;
        boolean bl38 = this.isPriceDropReqd;
        boolean bl39 = this.recentlyViewedProdPrice;
        boolean bl40 = this.priceDropValue;
        String string33 = this.priceDrop;
        boolean bl41 = this.pdpInfoProviderLuxeEnable;
        boolean bl42 = this.shouldShowProductDescription;
        String string34 = this.promoImageurl;
        String string35 = this.accBannerDesc;
        String string36 = this.colorGroup;
        boolean bl43 = this.showOODEnable;
        boolean bl44 = this.isPrioritydeliveryFeatureEnable;
        String string37 = this.deliverySlaTag;
        boolean bl45 = this.showFinalPrice;
        String string38 = this.finalPriceValue;
        String string39 = this.finalPriceContentDescription;
        boolean bl46 = this.showMrpPrice;
        SpannableString spannableString = this.mrpPriceValue;
        String string40 = this.mrpPriceContentDescription;
        boolean bl47 = this.showDiscountPrice;
        String string41 = this.discountPriceValue;
        String string42 = this.discountPriceContentDescription;
        boolean bl48 = this.setDiscountColor;
        Float f5 = this.wasPriceValue;
        Float f6 = this.priceValue;
        Float f7 = this.bestPriceValue;
        String string43 = this.discountPercentValue;
        String string44 = this.offerPrice;
        boolean bl49 = this.isDodEnabled;
        String string45 = string8;
        boolean bl50 = bl49;
        long l2 = this.dodEndTime;
        string8 = this.offerPriceValue;
        boolean bl51 = this.showOfferPrice;
        String string46 = this.offerPriceContentDescription;
        boolean bl52 = this.setOfferPriceDrawable;
        boolean bl53 = this.setOfferPrice;
        boolean bl54 = this.isGwpEnabled;
        boolean bl55 = this.isGiftAvailable;
        String string47 = this.gwpFreebiesOneText;
        boolean bl56 = this.isLuxeEnabled;
        boolean bl57 = this.isGWPFeatureEnabledAjioLuxe;
        boolean bl58 = this.isPreSalePlp;
        boolean bl59 = this.isSaleWishlist;
        boolean bl60 = this.enableSaleContainer;
        boolean bl61 = this.isLuxeAfercartAndLuxeEnable;
        boolean bl62 = this.isSaleContainerSpaceRetained;
        boolean bl63 = this.isRatingEnabledPlp;
        boolean bl64 = this.isRatingStarDisplayEnabled;
        String string48 = this.productRatingCount;
        Double d2 = this.averageRating;
        boolean bl65 = this.showAjiogramTag;
        boolean bl66 = this.showPlpGrid;
        boolean bl67 = this.productTextWrap;
        boolean bl68 = this.enableAddtoCart;
        boolean bl69 = this.enableCartClosetSizeLayout;
        boolean bl70 = this.enableCartClosetSelectSize;
        boolean bl71 = this.enabledeleteImg;
        boolean bl72 = this.enableSimilarCartClosetCLick;
        boolean bl73 = this.enableAddToBagCartClosetClick;
        boolean bl74 = this.enableDeleteOssContainer;
        boolean bl75 = this.enableOOSTV;
        boolean bl76 = this.enableOOSBG;
        boolean bl77 = this.enableOutOfStock;
        boolean bl78 = this.enableAddedToBag;
        boolean bl79 = this.enableCartClosetAddToBag;
        boolean bl80 = this.closetSelectionEnable;
        boolean bl81 = this.isRecentlyViewLayoutChanges;
        boolean bl82 = this.isPromoImageAvailable;
        boolean bl83 = this.isPriceValueChanges;
        boolean bl84 = this.enableFreebie;
        boolean bl85 = this.enableWishlistView;
        boolean bl86 = this.enableComingSoonProducts;
        boolean bl87 = this.sellingFastTag;
        boolean bl88 = this.layoutWidthChangesRequired;
        boolean bl89 = this.enablebackground;
        boolean bl90 = this.enableRatingView;
        boolean bl91 = this.cartClosetClickListners;
        boolean bl92 = this.cartClickListners;
        boolean bl93 = this.luxeCartClickListners;
        boolean bl94 = this.recentViewclickListners;
        boolean bl95 = this.newProductViewClickListeners;
        boolean bl96 = this.productClicklisteners;
        bl49 = this.isRecentlyWidgetEnable;
        object = og_1.a("PlpProductUIModel(brandName=", (String)object2, ", productName=", string2, ", productCode=");
        X50.a((StringBuilder)object, string3, ", productColorCode=", string4, ", viewTypeWishlist=");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(", productType=");
        ((StringBuilder)object).append((Object)homeWidgetTypes);
        ((StringBuilder)object).append(", viewHolderPos=");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(", isAjiogramStoreId=");
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append(", productImageUrl=");
        X50.a((StringBuilder)object, string5, ", productImageContentDescription=", string6, ", extraImagesUrlList=");
        ((StringBuilder)object).append(arrayList);
        ((StringBuilder)object).append(", productImgPlaceholerDescription=");
        ((StringBuilder)object).append(string7);
        ((StringBuilder)object).append(", isSimilarProductEnabled=");
        ((StringBuilder)object).append(bl3);
        ((StringBuilder)object).append(", similarProductType=");
        object2 = string45;
        ((StringBuilder)object).append(string45);
        ((StringBuilder)object).append(", similarIconContentDescription=");
        object2 = string9;
        ((StringBuilder)object).append(string9);
        ((StringBuilder)object).append(", isProductWishlisted=");
        ((StringBuilder)object).append(bl4);
        ((StringBuilder)object).append(", wishlistCountShortText=");
        string3 = string10;
        string4 = string11;
        X50.a((StringBuilder)object, string10, ", wishlistCountLongText=", string11, ", isWishlistCountAvailable=");
        ((StringBuilder)object).append(bl5);
        ((StringBuilder)object).append(", closetButtonContentDescription=");
        object2 = string12;
        ((StringBuilder)object).append(string12);
        ((StringBuilder)object).append(", closetAddedButtonContentDescription=");
        string3 = string13;
        string4 = string14;
        X50.a((StringBuilder)object, string13, ", closetSimilarContentDescription=", string14, ", showProductTags=");
        I81.a(", showAdTag=", ", productTagValue=", (StringBuilder)object, bl6, bl7);
        string3 = string15;
        string4 = string16;
        X50.a((StringBuilder)object, string15, ", productTagViewContentDescription=", string16, ", isPlpUrgencyTagEnabled=");
        ((StringBuilder)object).append(bl8);
        ((StringBuilder)object).append(", urgencyTagValue=");
        object2 = string17;
        ((StringBuilder)object).append(string17);
        ((StringBuilder)object).append(", isPlpBargainUrgencyTagEnabled=");
        ((StringBuilder)object).append(bl9);
        ((StringBuilder)object).append(", bargainUrgencyTagValue=");
        object2 = string18;
        ((StringBuilder)object).append(string18);
        ((StringBuilder)object).append(", isAjiogramProduct=");
        object2 = bl10;
        ((StringBuilder)object).append(bl10);
        ((StringBuilder)object).append(", showSizeLayout=");
        ((StringBuilder)object).append(bl11);
        ((StringBuilder)object).append(", showSizeVariants=");
        I81.a(", showSizeFirstView=", ", showSizeSecondView=", (StringBuilder)object, bl12, bl13);
        I81.a(", showSizeThirdView=", ", showSizeFourthView=", (StringBuilder)object, bl14, bl15);
        I81.a(", showSizeCount=", ", sizeFirstViewText=", (StringBuilder)object, bl16, bl17);
        string3 = string19;
        string4 = string20;
        X50.a((StringBuilder)object, string19, ", sizeSecondViewText=", string20, ", sizeThirdViewText=");
        string3 = string21;
        string4 = string22;
        X50.a((StringBuilder)object, string21, ", sizeFourthViewText=", string22, ", sizeCountText=");
        object2 = string23;
        ((StringBuilder)object).append(string23);
        ((StringBuilder)object).append(", showSizeView=");
        ((StringBuilder)object).append(bl18);
        ((StringBuilder)object).append(", sizeContentDescription=");
        object2 = string24;
        ((StringBuilder)object).append(string24);
        ((StringBuilder)object).append(", showAddedToCart=");
        ((StringBuilder)object).append(bl19);
        ((StringBuilder)object).append(", enableAddtoBag=");
        I81.a(", isComingSoonEnable=", ", isAfterCartLuxEnabled=", (StringBuilder)object, bl20, bl21);
        I81.a(", isSimilarOOSWishListAjioANDOOSBagEnabled=", ", isSimilarOOSWishListLuxeANDOOSBagEnabled=", (StringBuilder)object, bl22, bl23);
        I81.a(", isHeaderNotEmpty=", ", headerText=", (StringBuilder)object, bl24, bl25);
        object2 = string25;
        ((StringBuilder)object).append(string25);
        ((StringBuilder)object).append(", variantOptions=");
        object2 = list;
        ((StringBuilder)object).append(list);
        ((StringBuilder)object).append(", productOptionVariants=");
        object2 = list2;
        ((StringBuilder)object).append(list2);
        ((StringBuilder)object).append(", populateSelectSizeLabel=");
        ((StringBuilder)object).append(bl26);
        ((StringBuilder)object).append(", deleteWishlistContentDescription=");
        string3 = string26;
        string4 = string27;
        X50.a((StringBuilder)object, string26, ", addToBagContentDescription=", string27, ", oosSimilarContentDescription=");
        string3 = string28;
        string4 = string29;
        X50.a((StringBuilder)object, string28, ", closetAddBagContentDescription=", string29, ", isImageLoaded=");
        I81.a(", isLuxeCartPriceEnable=", ", isAllOutOfStock=", (StringBuilder)object, bl27, bl28);
        ((StringBuilder)object).append(bl29);
        ((StringBuilder)object).append(", closetAddBagText=");
        object2 = string30;
        ((StringBuilder)object).append(string30);
        ((StringBuilder)object).append(", addedToCartText=");
        object2 = string31;
        ((StringBuilder)object).append(string31);
        ((StringBuilder)object).append(", checkIfTalkbackServiceEnabled=");
        ((StringBuilder)object).append(bl30);
        ((StringBuilder)object).append(", isSimilarOOSWishlistEnabled=");
        I81.a(", isSelectionMode=", ", isPositionSelected=", (StringBuilder)object, bl31, bl32);
        I81.a(", isSimilarOOSWishlistLuxeEnabled=", ", fnlColorVariantData=", (StringBuilder)object, bl33, bl34);
        object2 = productFnlColorVariantData;
        ((StringBuilder)object).append(productFnlColorVariantData);
        ((StringBuilder)object).append(", isAllPromotions=");
        ((StringBuilder)object).append(bl35);
        ((StringBuilder)object).append(", promoContentDescription=");
        object2 = string32;
        ((StringBuilder)object).append(string32);
        ((StringBuilder)object).append(", cardUi=");
        ((StringBuilder)object).append(bl36);
        ((StringBuilder)object).append(", isFromHomeProductWidget=");
        I81.a(", isPriceDropReqd=", ", recentlyViewedProdPrice=", (StringBuilder)object, bl37, bl38);
        I81.a(", priceDropValue=", ", priceDrop=", (StringBuilder)object, bl39, bl40);
        object2 = string33;
        ((StringBuilder)object).append(string33);
        ((StringBuilder)object).append(", pdpInfoProviderLuxeEnable=");
        ((StringBuilder)object).append(bl41);
        ((StringBuilder)object).append(", shouldShowProductDescription=");
        ((StringBuilder)object).append(bl42);
        ((StringBuilder)object).append(", promoImageurl=");
        object2 = string34;
        ((StringBuilder)object).append(string34);
        ((StringBuilder)object).append(", accBannerDesc=");
        string3 = string35;
        string4 = string36;
        X50.a((StringBuilder)object, string35, ", colorGroup=", string36, ", showOODEnable=");
        I81.a(", isPrioritydeliveryFeatureEnable=", ", deliverySlaTag=", (StringBuilder)object, bl43, bl44);
        object2 = string37;
        ((StringBuilder)object).append(string37);
        ((StringBuilder)object).append(", showFinalPrice=");
        ((StringBuilder)object).append(bl45);
        ((StringBuilder)object).append(", finalPriceValue=");
        string3 = string38;
        string4 = string39;
        X50.a((StringBuilder)object, string38, ", finalPriceContentDescription=", string39, ", showMrpPrice=");
        ((StringBuilder)object).append(bl46);
        ((StringBuilder)object).append(", mrpPriceValue=");
        object2 = spannableString;
        ((StringBuilder)object).append(spannableString);
        ((StringBuilder)object).append(", mrpPriceContentDescription=");
        object2 = string40;
        ((StringBuilder)object).append(string40);
        ((StringBuilder)object).append(", showDiscountPrice=");
        ((StringBuilder)object).append(bl47);
        ((StringBuilder)object).append(", discountPriceValue=");
        string3 = string41;
        string4 = string42;
        X50.a((StringBuilder)object, string41, ", discountPriceContentDescription=", string42, ", setDiscountColor=");
        ((StringBuilder)object).append(bl48);
        ((StringBuilder)object).append(", wasPriceValue=");
        object2 = f5;
        ((StringBuilder)object).append(f5);
        ((StringBuilder)object).append(", priceValue=");
        object2 = f6;
        ((StringBuilder)object).append(f6);
        ((StringBuilder)object).append(", bestPriceValue=");
        object2 = f7;
        ((StringBuilder)object).append(f7);
        ((StringBuilder)object).append(", discountPercentValue=");
        string3 = string43;
        string4 = string44;
        X50.a((StringBuilder)object, string43, ", offerPrice=", string44, ", isDodEnabled=");
        ((StringBuilder)object).append(bl50);
        ((StringBuilder)object).append(", dodEndTime=");
        ((StringBuilder)object).append(l2);
        ((StringBuilder)object).append(", offerPriceValue=");
        object2 = string8;
        ((StringBuilder)object).append(string8);
        ((StringBuilder)object).append(", showOfferPrice=");
        ((StringBuilder)object).append(bl51);
        ((StringBuilder)object).append(", offerPriceContentDescription=");
        object2 = string46;
        ((StringBuilder)object).append(string46);
        ((StringBuilder)object).append(", setOfferPriceDrawable=");
        ((StringBuilder)object).append(bl52);
        dm_1.b(", setOfferPrice=", ", isGwpEnabled=", (StringBuilder)object, bl53, bl54);
        ((StringBuilder)object).append(", isGiftAvailable=");
        ((StringBuilder)object).append(bl55);
        ((StringBuilder)object).append(", gwpFreebiesOneText=");
        object2 = string47;
        ((StringBuilder)object).append(string47);
        dm_1.b(", isLuxeEnabled=", ", isGWPFeatureEnabledAjioLuxe=", (StringBuilder)object, bl56, bl57);
        dm_1.b(", isPreSalePlp=", ", isSaleWishlist=", (StringBuilder)object, bl58, bl59);
        dm_1.b(", enableSaleContainer=", ", isLuxeAfercartAndLuxeEnable=", (StringBuilder)object, bl60, bl61);
        dm_1.b(", isSaleContainerSpaceRetained=", ", isRatingEnabledPlp=", (StringBuilder)object, bl62, bl63);
        ((StringBuilder)object).append(", isRatingStarDisplayEnabled=");
        ((StringBuilder)object).append(bl64);
        ((StringBuilder)object).append(", productRatingCount=");
        object2 = string48;
        ((StringBuilder)object).append(string48);
        ((StringBuilder)object).append(", averageRating=");
        object2 = d2;
        ((StringBuilder)object).append(d2);
        ((StringBuilder)object).append(", showAjiogramTag=");
        ((StringBuilder)object).append(bl65);
        dm_1.b(", showPlpGrid=", ", productTextWrap=", (StringBuilder)object, bl66, bl67);
        dm_1.b(", enableAddtoCart=", ", enableCartClosetSizeLayout=", (StringBuilder)object, bl68, bl69);
        dm_1.b(", enableCartClosetSelectSize=", ", enabledeleteImg=", (StringBuilder)object, bl70, bl71);
        dm_1.b(", enableSimilarCartClosetCLick=", ", enableAddToBagCartClosetClick=", (StringBuilder)object, bl72, bl73);
        dm_1.b(", enableDeleteOssContainer=", ", enableOOSTV=", (StringBuilder)object, bl74, bl75);
        dm_1.b(", enableOOSBG=", ", enableOutOfStock=", (StringBuilder)object, bl76, bl77);
        dm_1.b(", enableAddedToBag=", ", enableCartClosetAddToBag=", (StringBuilder)object, bl78, bl79);
        dm_1.b(", closetSelectionEnable=", ", isRecentlyViewLayoutChanges=", (StringBuilder)object, bl80, bl81);
        dm_1.b(", isPromoImageAvailable=", ", isPriceValueChanges=", (StringBuilder)object, bl82, bl83);
        dm_1.b(", enableFreebie=", ", enableWishlistView=", (StringBuilder)object, bl84, bl85);
        dm_1.b(", enableComingSoonProducts=", ", sellingFastTag=", (StringBuilder)object, bl86, bl87);
        dm_1.b(", layoutWidthChangesRequired=", ", enablebackground=", (StringBuilder)object, bl88, bl89);
        dm_1.b(", enableRatingView=", ", cartClosetClickListners=", (StringBuilder)object, bl90, bl91);
        dm_1.b(", cartClickListners=", ", luxeCartClickListners=", (StringBuilder)object, bl92, bl93);
        dm_1.b(", recentViewclickListners=", ", newProductViewClickListeners=", (StringBuilder)object, bl94, bl95);
        dm_1.b(", productClicklisteners=", ", isRecentlyWidgetEnable=", (StringBuilder)object, bl96, bl49);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

