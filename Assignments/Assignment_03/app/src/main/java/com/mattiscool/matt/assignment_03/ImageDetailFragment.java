package com.mattiscool.matt.assignment_03;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.mattiscool.matt.assignment_03.imageContent.ImageContent;

/**
 * A fragment representing a single Image detail screen.
 * This fragment is either contained in a {@link ImageListActivity}
 * in two-pane mode (on tablets) or a {@link ImageDetailActivity}
 * on handsets.
 */
public class ImageDetailFragment extends Fragment {
    ImageView imView;
    private String one = "1";
    private String two = "2";
    private String three = "3";
    private String four = "4";
    private String five = "5";
    private Context context;




    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The imageContent content this fragment is presenting.
     */
    private ImageContent.ImageItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ImageDetailFragment()
    {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the imageContent content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = ImageContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            //Here now we're displaying the image name from the strings library...
            if (appBarLayout != null)
            {
                if(mItem.id.equals(one))
                {
                    appBarLayout.setTitle(getText(R.string.img_01));
                }
                else if(mItem.id.equals(two))
                {
                    appBarLayout.setTitle(getText(R.string.img_02));
                }
                else if(mItem.id.equals(three))
                {
                    appBarLayout.setTitle(getText(R.string.img_03));
                }
                else if(mItem.id.equals(four))
                {
                    appBarLayout.setTitle(getText(R.string.img_04));
                }
                else if(mItem.id.equals(five))
                {
                    appBarLayout.setTitle(getText(R.string.img_05));
                }
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.image_detail, container, false);
        //Adding to Shared Preferences here...
        context = container.getContext();
        SharedPreferences sharedPrefs = context.getSharedPreferences("buttonClicks01",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPrefs.edit();
        imView =(ImageView) rootView.findViewById(R.id.img_display);
        // Show the imageContent content as text in a TextView.//We want it to be an image view...
        Animation anim = AnimationUtils.loadAnimation(getContext(),R.anim.animate);

        if (mItem != null) {
            if(mItem.id.equals(one))
            {
                imView.setImageResource(R.drawable.image_01);
                imView.startAnimation(anim);
                editor.putString("img_01","clicked");
                editor.apply();
                return rootView;
            }
//            ((TextView) rootView.findViewById(R.id.image_detail)).setText(mItem.url);
            //This works!
            else if(mItem.id.equals(two))
            {
                imView.setImageResource(R.drawable.image_02);
                imView.startAnimation(anim);
                editor.putString("img_02","clicked");
                editor.apply();
                return rootView;
            }
            else if(mItem.id.equals(three))
            {
                imView.setImageResource(R.drawable.image_03);
                imView.startAnimation(anim);
                editor.putString("img_03","clicked");
                editor.apply();
                return rootView;
            }
            else if(mItem.id.equals(four))
            {
                imView.setImageResource(R.drawable.image_04);
                imView.startAnimation(anim);
                editor.putString("img_04","clicked");
                editor.apply();
                return rootView;
            }
            else if(mItem.id.equals(five))
            {
                imView.setImageResource(R.drawable.image_05);
                imView.startAnimation(anim);
                editor.putString("img_05","clicked");
                editor.apply();
                return rootView;
            }
        }

        return rootView;
    }

    public void animationDoer()
    {
        Animation anim = AnimationUtils.loadAnimation(this.context,R.anim.animate);
    }
}
