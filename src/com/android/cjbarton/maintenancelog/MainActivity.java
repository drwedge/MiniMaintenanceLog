// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.cjbarton.maintenancelog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package com.android.cjbarton.maintenancelog:
//            acknowledgementsActivity, inspection1Activity, inspection2Activity, OilChgActivity, 
//            resetSILActivity

public class MainActivity extends AppCompatActivity
{

    public MainActivity()
    {
    }

    public void btnAcknowledgements(View view)
    {
        startActivity(new Intent(this, com/android/cjbarton/maintenancelog/acknowledgementsActivity));
    }

    public void btnInspection1Handler(View view)
    {
        startActivity(new Intent(this, com/android/cjbarton/maintenancelog/inspection1Activity));
    }

    public void btnInspection2Handler(View view)
    {
        startActivity(new Intent(this, com/android/cjbarton/maintenancelog/inspection2Activity));
    }

    public void btnOilClickHandler(View view)
    {
        startActivity(new Intent(this, com/android/cjbarton/maintenancelog/OilChgActivity));
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04001c);
        setSupportActionBar((Toolbar)findViewById(0x7f0c0069));
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0c00b2)
        {
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void resetSIL(View view)
    {
        startActivity(new Intent(this, com/android/cjbarton/maintenancelog/resetSILActivity));
    }
}
