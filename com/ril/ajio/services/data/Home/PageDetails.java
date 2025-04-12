/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Home;

import com.ril.ajio.services.data.BannerImageDetails;
import com.ril.ajio.services.data.LANDINGPAGETYPE;
import java.util.Comparator;
import java.util.List;

public class PageDetails
implements Comparable,
Comparator {
    private BannerImageDetails banner;
    private List bannerImageDetails;
    private String content;
    private String css;
    private String imageUrl;
    private String linkName;
    private String mobileCatAppUrl;
    private List nativeCategoryNavigationListDetail;
    private String page;
    private String position;
    private String query;
    private String slotName;
    private String style1;
    private String style2;
    private String title;
    private LANDINGPAGETYPE type;
    private String typeCode;
    private String uId;
    private String urlLink;
    private String viewTitle;

    public PageDetails() {
        String string2;
        this.css = string2 = "";
        this.position = string2;
        this.imageUrl = string2;
        this.slotName = string2;
        this.uId = string2;
        this.content = string2;
        this.linkName = string2;
        this.urlLink = string2;
        this.mobileCatAppUrl = string2;
        this.query = string2;
        this.page = string2;
        this.typeCode = string2;
        this.title = string2;
        this.style1 = string2;
        this.style2 = string2;
        this.viewTitle = string2;
    }

    private boolean bothAreSection(String string2, String string3) {
        String string4;
        boolean bl2;
        boolean bl3;
        boolean bl4 = false;
        if (string2 != null && string3 != null && !(bl3 = string2.isEmpty()) && !(bl3 = string3.isEmpty()) && (bl2 = (string2 = string2.toLowerCase()).contains(string4 = "section")) && (bl2 = (string2 = string3.toLowerCase()).contains(string4))) {
            bl4 = true;
        }
        return bl4;
    }

    private int extractInt(String string2) {
        int n3;
        String string3 = "\\D";
        String string4 = "";
        boolean bl2 = (string2 = string2.replaceAll(string3, string4)).isEmpty();
        if (bl2) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = Integer.parseInt(string2);
        }
        return n3;
    }

    private String getPosition() {
        return this.position;
    }

    public int compare(PageDetails object, PageDetails object2) {
        int n3;
        String string2 = ((PageDetails)object).position;
        String string3 = ((PageDetails)object2).position;
        boolean bl2 = this.bothAreSection(string2, string3);
        if (bl2) {
            object = ((PageDetails)object).position;
            n3 = this.extractInt((String)object);
            object2 = super.getPosition();
            int n4 = this.extractInt((String)object2);
            object = n3;
            object2 = n4;
            n3 = ((Integer)object).compareTo((Integer)object2);
        } else {
            object = ((PageDetails)object).position;
            object2 = ((PageDetails)object2).position;
            n3 = ((String)object).compareTo((String)object2);
        }
        return n3;
    }

    public int compareTo(PageDetails object) {
        int n3;
        Object object2 = this.position;
        String string2 = ((PageDetails)object).position;
        int n4 = this.bothAreSection((String)object2, string2);
        if (n4 != 0) {
            object2 = this.position;
            n4 = this.extractInt((String)object2);
            object = super.getPosition();
            n3 = this.extractInt((String)object);
            object2 = n4;
            object = n3;
            n3 = ((Integer)object2).compareTo((Integer)object);
        } else {
            object2 = this.position;
            object = ((PageDetails)object).position;
            n3 = ((String)object2).compareTo((String)object);
        }
        return n3;
    }

    public BannerImageDetails getBanner() {
        return this.banner;
    }

    public List getBannerImageDetails() {
        return this.bannerImageDetails;
    }

    public String getContent() {
        return this.content;
    }

    public String getCss() {
        return this.css;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getLinkName() {
        return this.linkName;
    }

    public String getMobileCatAppUrl() {
        return this.mobileCatAppUrl;
    }

    public List getNativeCategoryNavigationListDetail() {
        return this.nativeCategoryNavigationListDetail;
    }

    public List getNativeCategoryNavigationListDetails() {
        return this.nativeCategoryNavigationListDetail;
    }

    public String getPage() {
        return this.page;
    }

    public String getQuery() {
        return this.query;
    }

    public String getSlotName() {
        return this.slotName;
    }

    public String getStyle1() {
        return this.style1;
    }

    public String getStyle2() {
        return this.style2;
    }

    public String getTitle() {
        return this.title;
    }

    public LANDINGPAGETYPE getType() {
        return this.type;
    }

    public String getTypeCode() {
        return this.typeCode;
    }

    public String getUrlLink() {
        return this.urlLink;
    }

    public String getViewTitle() {
        return this.viewTitle;
    }

    public String getuId() {
        return this.uId;
    }

    public void setBanner(BannerImageDetails bannerImageDetails) {
        this.banner = bannerImageDetails;
    }

    public void setBannerImageDetails(List list) {
        this.bannerImageDetails = list;
    }

    public void setContent(String string2) {
        this.content = string2;
    }

    public void setCss(String string2) {
        this.css = string2;
    }

    public void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public void setLinkName(String string2) {
        this.linkName = string2;
    }

    public void setMobileCatAppUrl(String string2) {
        this.mobileCatAppUrl = string2;
    }

    public void setNativeCategoryNavigationListDetail(List list) {
        this.nativeCategoryNavigationListDetail = list;
    }

    public void setNativeCategoryNavigationListDetails(List list) {
        this.nativeCategoryNavigationListDetail = list;
    }

    public void setPage(String string2) {
        this.page = string2;
    }

    public void setPosition(String string2) {
        this.position = string2;
    }

    public void setQuery(String string2) {
        this.query = string2;
    }

    public void setSlotName(String string2) {
        this.slotName = string2;
    }

    public void setStyle1(String string2) {
        this.style1 = string2;
    }

    public void setStyle2(String string2) {
        this.style2 = string2;
    }

    public void setTitle(String string2) {
        this.title = string2;
    }

    public void setType(LANDINGPAGETYPE lANDINGPAGETYPE) {
        this.type = lANDINGPAGETYPE;
    }

    public void setTypeCode(String string2) {
        this.typeCode = string2;
    }

    public void setUrlLink(String string2) {
        this.urlLink = string2;
    }

    public void setViewTitle(String string2) {
        this.viewTitle = string2;
    }

    public void setuId(String string2) {
        this.uId = string2;
    }
}

