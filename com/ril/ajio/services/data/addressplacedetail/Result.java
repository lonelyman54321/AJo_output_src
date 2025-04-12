/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.addressplacedetail;

import com.ril.ajio.services.data.addressplacedetail.Geometry;
import com.ril.ajio.services.data.addressplacedetail.Opening_hours;
import com.ril.ajio.services.data.addressplacedetail.Photos;
import com.ril.ajio.services.data.addressplacedetail.PlusCode;
import com.ril.ajio.services.data.addressplacedetail.Reviews;
import java.util.ArrayList;

public class Result {
    private ArrayList addressComponents;
    private String adr_address;
    private String formatted_address;
    private Geometry geometry;
    private String icon;
    private String id;
    private String name;
    private Opening_hours opening_hours;
    private Photos[] photos;
    private String place_id;
    private PlusCode plusCode;
    private String rating;
    private String reference;
    private Reviews[] reviews;
    private String scope;
    private String[] types;
    private String url;
    private String utc_offset;
    private String vicinity;

    public ArrayList getAddressComponents() {
        return this.addressComponents;
    }

    public String getAdr_address() {
        return this.adr_address;
    }

    public String getFormatted_address() {
        return this.formatted_address;
    }

    public Geometry getGeometry() {
        return this.geometry;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Opening_hours getOpening_hours() {
        return this.opening_hours;
    }

    public Photos[] getPhotos() {
        return this.photos;
    }

    public String getPlace_id() {
        return this.place_id;
    }

    public PlusCode getPlusCode() {
        return this.plusCode;
    }

    public String getRating() {
        return this.rating;
    }

    public String getReference() {
        return this.reference;
    }

    public Reviews[] getReviews() {
        return this.reviews;
    }

    public String getScope() {
        return this.scope;
    }

    public String[] getTypes() {
        return this.types;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUtc_offset() {
        return this.utc_offset;
    }

    public String getVicinity() {
        return this.vicinity;
    }

    public void setAddressComponents(ArrayList arrayList) {
        this.addressComponents = arrayList;
    }

    public void setAdr_address(String string2) {
        this.adr_address = string2;
    }

    public void setFormatted_address(String string2) {
        this.formatted_address = string2;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public void setIcon(String string2) {
        this.icon = string2;
    }

    public void setId(String string2) {
        this.id = string2;
    }

    public void setName(String string2) {
        this.name = string2;
    }

    public void setOpening_hours(Opening_hours opening_hours) {
        this.opening_hours = opening_hours;
    }

    public void setPhotos(Photos[] photosArray) {
        this.photos = photosArray;
    }

    public void setPlace_id(String string2) {
        this.place_id = string2;
    }

    public void setPlusCode(PlusCode plusCode) {
        this.plusCode = plusCode;
    }

    public void setRating(String string2) {
        this.rating = string2;
    }

    public void setReference(String string2) {
        this.reference = string2;
    }

    public void setReviews(Reviews[] reviewsArray) {
        this.reviews = reviewsArray;
    }

    public void setScope(String string2) {
        this.scope = string2;
    }

    public void setTypes(String[] stringArray) {
        this.types = stringArray;
    }

    public void setUrl(String string2) {
        this.url = string2;
    }

    public void setUtc_offset(String string2) {
        this.utc_offset = string2;
    }

    public void setVicinity(String string2) {
        this.vicinity = string2;
    }
}

