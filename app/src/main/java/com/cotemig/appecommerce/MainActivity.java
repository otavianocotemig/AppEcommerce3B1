package com.cotemig.appecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    //instanciar a classe viewHolder
    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getActionBar();
        //actionBar.setTitle("teste");


        // identificar e definir os componentes que serão manipulados da activity
        this.mViewHolder.iv_Product_details = this.findViewById(R.id.iv_Product_details);
        this.mViewHolder.iv_Product_details.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // chamda da tela de details products
        Intent acessoTelaDetailsProducts = new Intent(this,product_detailActivity.class);
        startActivity(acessoTelaDetailsProducts);


    }

    private static class ViewHolder{
        private ImageView iv_Product_details;
    }
}
