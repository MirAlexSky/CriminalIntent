package criminalintent.android.mirsky.com.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {

    public static String EXTRA_CRIME_ID = "crime_id";

    public static Intent newIntent(Context packageContext, UUID id) {
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, id);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        UUID crimeID = (UUID) getIntent().
                getSerializableExtra(EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeID);
    }
}
