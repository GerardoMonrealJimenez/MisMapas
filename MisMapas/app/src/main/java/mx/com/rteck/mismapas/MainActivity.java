package mx.com.rteck.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import mx.com.rteck.mismapas.Adaptador.LugaresAdaptador;
import mx.com.rteck.mismapas.Pojo.Lugar;

public class MainActivity extends AppCompatActivity {

    ArrayList<Lugar>lugares;
    private RecyclerView rvListaLugares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvListaLugares= (RecyclerView)findViewById(R.id.rvLugares);
        generarGridLayout();
        lugares = new ArrayList<>();
        AltaLugares();
        inicializarAdaptador();
    }

    public void AltaLugares()
    {
        lugares.add(new Lugar(R.drawable.museo_de_la_m_scara1,22.1507002,-100.9763539));
        lugares.add(new Lugar(R.drawable.tangamanga,22.1266808,-101.0129754));
        lugares.add(new Lugar(R.drawable.plaza_de_armas_san_luis,22.1516832,-100.9786282));
        lugares.add(new Lugar(R.drawable.teatro_paz,22.1509035,-100.9757364));

    }

    public void inicializarAdaptador()
    {
        LugaresAdaptador adaptador = new LugaresAdaptador(this,lugares);
        rvListaLugares.setAdapter(adaptador);
    }

    public void generarGridLayout()
    {
        LinearLayoutManager llm = new LinearLayoutManager(this);
        //GridLayoutManager glm = new GridLayoutManager(this,2);
        rvListaLugares.setLayoutManager(llm);
    }
}
