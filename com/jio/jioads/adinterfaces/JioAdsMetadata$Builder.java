/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.utils.Constants$GENDER;
import com.jio.jioads.utils.Constants$KIDS_PROTECTED;
import java.util.Map;

public final class JioAdsMetadata$Builder {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public Constants$KIDS_PROTECTED n;
    public Constants$GENDER o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public Map y;

    public final JioAdsMetadata build() {
        JioAdsMetadata jioAdsMetadata = new JioAdsMetadata(this, null);
        return jioAdsMetadata;
    }

    public final String getActor() {
        return this.l;
    }

    public final String getAge() {
        return this.t;
    }

    public final String getAppVersion() {
        return this.p;
    }

    public final String getChannelId() {
        return this.a;
    }

    public final String getChannelName() {
        return this.b;
    }

    public final String getCity() {
        return this.s;
    }

    public final String getContentId() {
        return this.h;
    }

    public final String getContentTitle() {
        return this.i;
    }

    public final String getContentType() {
        return this.j;
    }

    public final String getCountry() {
        return this.u;
    }

    public final Map getCustomMetadata() {
        return this.y;
    }

    public final Constants$GENDER getGender() {
        return this.o;
    }

    public final String getGenre() {
        return this.q;
    }

    public final String getKeywords() {
        return this.w;
    }

    public final String getLanguage() {
        return this.g;
    }

    public final String getLanguageOfArticle() {
        return this.f;
    }

    public final String getObjects() {
        return this.m;
    }

    public final String getPageCategory() {
        return this.d;
    }

    public final String getPincode() {
        return this.v;
    }

    public final String getPlacementName() {
        return this.x;
    }

    public final String getSectionCategory() {
        return this.e;
    }

    public final String getShowName() {
        return this.c;
    }

    public final String getState() {
        return this.r;
    }

    public final String getVendor() {
        return this.k;
    }

    public final Constants$KIDS_PROTECTED isKidsProtected() {
        return this.n;
    }

    public final JioAdsMetadata$Builder setActor(String string2) {
        this.l = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setAge(String string2) {
        this.t = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setAppVersion(String string2) {
        this.p = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setChannelId(String string2) {
        this.a = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setChannelName(String string2) {
        this.b = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setCity(String string2) {
        this.s = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setContentId(String string2) {
        this.h = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setContentTitle(String string2) {
        this.i = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setContentType(String string2) {
        this.j = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setCountry(String string2) {
        this.u = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setCustomMetadata(Map map2) {
        this.y = map2;
        return this;
    }

    public final JioAdsMetadata$Builder setGender(Constants$GENDER constants$GENDER) {
        this.o = constants$GENDER;
        return this;
    }

    public final JioAdsMetadata$Builder setGenre(String string2) {
        this.q = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setIsKidsProtected(Constants$KIDS_PROTECTED constants$KIDS_PROTECTED) {
        this.n = constants$KIDS_PROTECTED;
        return this;
    }

    public final JioAdsMetadata$Builder setKeywords(String string2) {
        this.w = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setLanguage(String string2) {
        this.g = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setLanguageOfArticle(String string2) {
        this.f = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setObjects(String string2) {
        this.m = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setPageCategory(String string2) {
        this.d = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setPincode(String string2) {
        this.v = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setPlacementName(String string2) {
        this.x = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setSectionCategory(String string2) {
        this.e = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setShowName(String string2) {
        this.c = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setState(String string2) {
        this.r = string2;
        return this;
    }

    public final JioAdsMetadata$Builder setVendor(String string2) {
        this.k = string2;
        return this;
    }
}

