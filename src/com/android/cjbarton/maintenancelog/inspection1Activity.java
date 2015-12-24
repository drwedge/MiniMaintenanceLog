// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.cjbarton.maintenancelog;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class inspection1Activity extends AppCompatActivity
{

    public inspection1Activity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04001a);
        setSupportActionBar((Toolbar)findViewById(0x7f0c0069));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
