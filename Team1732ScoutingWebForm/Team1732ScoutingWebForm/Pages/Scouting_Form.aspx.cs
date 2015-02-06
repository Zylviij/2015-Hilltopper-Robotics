using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Team1732ScoutingWebForm
{
    public partial class _Default : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void dllAutoSelect_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (dllAutoSelect.SelectedItem.Equals("Other"))
            {

            }
        }

        protected void RadioButton1_CheckedChanged(object sender, EventArgs e)
        {

        }
    }
}
