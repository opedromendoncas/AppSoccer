package br.com.etecia.yourshoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView idLista;

    String titulo [] = {"Camisa do Vasco", "Camisa Real Madrid", "Camisa Barcelona"};
    String preco [] = {"R$ 199,99", "R$ 399,99", "R$ 349,99"};
    String desc [] = {"Vamos juntos empurrar o Vascão a escrever um novo capítulo em sua história", "Para os pequenos torcerem dentro ou fora dos estádios", "Destaque-se na torcida, com essa Camisa Barcelona"};
    int imagem [] = {R.drawable.vasco, R.drawable.real, R.drawable.barcelona};
    double rating [] = {3, 5, 5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idLista = findViewById(R.id.idLista);

        MyAdapter adapter = new MyAdapter();

        idLista.setAdapter(adapter);


    }

    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imagem.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            ImageView imagemcamisa;
            TextView titulocamisa, precocamisa, desccamisa;
            RatingBar rtbar;

            View v = getLayoutInflater().inflate(R.layout.model_shoes, null);

            imagemcamisa = v.findViewById(R.id.mimagem);
            titulocamisa = v.findViewById(R.id.mtitulo);
            precocamisa = v.findViewById(R.id.mpreco);
            desccamisa = v.findViewById(R.id.mdesc);
            rtbar = v.findViewById(R.id.mrtbar);

            titulocamisa.setText(titulo[i]);
            precocamisa.setText(preco[i]);
            desccamisa.setText(desc[i]);
            imagemcamisa.setImageResource(imagem[i]);
            rtbar.setRating((float)rating[i]);



            return v;



        }
    }


}