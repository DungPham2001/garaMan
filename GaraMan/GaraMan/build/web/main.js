/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {
    $('#example').DataTable( {
        order: [[ 3, 'desc' ], [ 0, 'asc' ]]
    } );
} );