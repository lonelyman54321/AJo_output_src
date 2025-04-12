/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Home;

import java.util.List;

public class NavigationNode {
    private List children = null;
    private String name;
    private boolean newFlag;
    private String title;
    private String uid;
    private boolean visible;

    public List getChildren() {
        return this.children;
    }

    public String getName() {
        return this.name;
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

    public void setChildren(List list) {
        this.children = list;
    }

    public void setName(String string2) {
        this.name = string2;
    }

    public void setNewFlag(boolean bl2) {
        this.newFlag = bl2;
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

