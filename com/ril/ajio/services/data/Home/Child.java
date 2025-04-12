/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Home;

import com.ril.ajio.services.data.Home.AppMedia;
import com.ril.ajio.services.data.Home.AppMedia2;

public class Child {
    private AppMedia appMedia;
    private AppMedia2 appMedia2;
    private String name;
    private boolean newFlag;
    private String nodeurlLink;
    private int position;
    private String title;
    private String uid;
    private boolean visible;

    public AppMedia getAppMedia() {
        return this.appMedia;
    }

    public AppMedia2 getAppMedia2() {
        return this.appMedia2;
    }

    public String getName() {
        return this.name;
    }

    public String getNodeurlLink() {
        return this.nodeurlLink;
    }

    public int getPosition() {
        return this.position;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUid() {
        return this.uid;
    }

    public boolean isNewFlag() {
        return this.newFlag;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void setAppMedia(AppMedia appMedia) {
        this.appMedia = appMedia;
    }

    public void setAppMedia2(AppMedia2 appMedia2) {
        this.appMedia2 = appMedia2;
    }

    public void setName(String string2) {
        this.name = string2;
    }

    public void setNewFlag(boolean bl2) {
        this.newFlag = bl2;
    }

    public void setNodeurlLink(String string2) {
        this.nodeurlLink = string2;
    }

    public void setPosition(int n3) {
        this.position = n3;
    }

    public void setTitle(String string2) {
        this.title = string2;
    }

    public void setUid(String string2) {
        this.uid = string2;
    }

    public void setVisible(boolean bl2) {
        this.visible = bl2;
    }
}

