import { Component, OnInit } from "@angular/core";

import { Item } from "./item";
import { ItemService } from "./item.service";
import { LottieView } from 'nativescript-lottie';
import { registerElement } from '@nativescript/angular';

registerElement('LottieView', () => LottieView);

@Component({
    selector: "ns-items",
    templateUrl: "./items.component.html",
    styleUrls: ['./items.component.css'],
    moduleId: module.id
})
export class ItemsComponent implements OnInit {
    items: Array<Item>;

    public loop: boolean = true;
    public src: string;
    public autoPlay: boolean = true;
    public animations: Array<string>;

    private _lottieView: LottieView;

    constructor(private itemService: ItemService) {
        //   this.animations = [
        //     'lightbulb.json'
        //   ];
        //   this.src = this.animations[0];

    }

    lottieViewLoaded(event) {

        console.log('loaded! ')
        console.log({ event })

        //   this._lottieView = <LottieView>event.object;

        //   this._lottieView.
        this._lottieView = <LottieView>event.object;

        this._lottieView.playAnimation();
    }

    ngOnInit(): void {
        this.items = this.itemService.getItems();
    }

    lottieViewCompleted(event) {

        console.log('completed! ')
        console.log({ event })

    }

    lottieViewFinished(event) {

        console.log('finished! ')
        console.log({ event })

        //   this._lottieView = <LottieView>event.object;

        //   this._lottieView.
    }
}
