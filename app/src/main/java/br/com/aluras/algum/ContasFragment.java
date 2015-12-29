package br.com.aluras.algum;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContasFragment extends Fragment {


    public ContasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_contas, container, false);

        String[] contas = new String[]{"Banco do Brasil", "Caixa", "Carteira Andre", "VR Adriana", "texto muito grande para ver no que da","Banco do Brasil", "Caixa", "Carteira Andre", "VR Adriana", "texto muito grande para ver no que da","Banco do Brasil", "Caixa", "Carteira Andre", "VR Adriana", "texto muito grande para ver no que da","Banco do Brasil", "Caixa", "Carteira Andre", "VR Adriana", "texto muito grande para ver no que da","Banco do Brasil", "Caixa", "Carteira Andre", "VR Adriana", "texto muito grande para ver no que da","Banco do Brasil", "Caixa", "Carteira Andre", "VR Adriana", "texto muito grande para ver no que da","Banco do Brasil", "Caixa", "Carteira Andre", "VR Adriana", "texto muito grande para ver no que da","Banco do Brasil", "Caixa", "Carteira Andre", "VR Adriana", "texto muito grande para ver no que da","Banco do Brasil", "Caixa", "Carteira Andre", "VR Adriana", "texto muito grande para ver no que da","Banco do Brasil", "Caixa", "Carteira Andre", "VR Adriana", "texto muito grande para ver no que da","Banco do Brasil", "Caixa", "Carteira Andre", "VR Adriana", "texto muito grande para ver no que da","Banco do Brasil", "Caixa", "Carteira Andre", "VR Adriana", "texto muito grande para ver no que da","Banco do Brasil", "Caixa", "Carteira Andre", "VR Adriana", "texto muito grande para ver no que da","Banco do Brasil", "Caixa", "Carteira Andre", "VR Adriana", "texto muito grande para ver no que da","Banco do Brasil", "Caixa", "Carteira Andre", "VR Adriana", "texto muito grande para ver no que da"};

        //AlgumSyncAdapter.syncImmediately(getActivity());
        ContasTask task = new ContasTask();
        task.execute();

        GridView grid = (GridView)rootView.findViewById(R.id.grid_contas);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.item_conta, R.id.txt_conta_nome, contas);

        grid.setAdapter(adapter);

        return rootView;
    }




}
