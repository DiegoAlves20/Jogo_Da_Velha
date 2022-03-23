package br.senai.sp.cotia.jogodavelha.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.senai.sp.cotia.jogodavelha.R;
import br.senai.sp.cotia.jogodavelha.databinding.FragmentJogoBinding;


public class JogoFragment extends Fragment {
    //variavel para acessar os elememtos da view
    private FragmentJogoBinding binding;
    //vetores dos botões
    private Button[] botoes;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //instanciar a binding
        binding = FragmentJogoBinding.inflate(inflater, container, false);

        //instaciar o vetor
        botoes = new Button[9];

        //associar o vetor dos botoes
        botoes[0]=  binding.bt00;
        botoes[1]=  binding.bt01;
        botoes[2]=  binding.bt02;
        botoes[3]=  binding.bt10;
        botoes[4]=  binding.bt11;
        botoes[5]=  binding.bt12;
        botoes[6]=  binding.bt20;
        botoes[7]=  binding.bt21;
        botoes[8]=  binding.bt22;

        //associa o listener aos botões
        for (Button bt : botoes){
            bt.setOnClickListener(listenerBotoes);

        }

        binding.bt00.setOnClickListener(listenerBotoes);
        binding.bt01.setOnClickListener(listenerBotoes);
        binding.bt02.setOnClickListener(listenerBotoes);
        //retorna a view root do binding
        return binding.getRoot();
    }
    //escutador de eventos dos botões
    private View.OnClickListener listenerBotoes = btPress ->{

        //obtém o nome do botão
        String nomeBotao = getContext().getResources().getResourceName(btPress.getId());

        //extrai a posição atráves do nome do botão
        String posicao = nomeBotao.substring(nomeBotao.length()-2);

        //extrai a linha e coluna da String posição
        int linha = Character.getNumericValue(posicao.charAt(0));
        int coluna = Character.getNumericValue(posicao.charAt(1));


    };
}